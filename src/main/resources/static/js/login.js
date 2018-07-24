/*验证登录信息是否正确*/
function checkLogin() {
    if (null == $("#name").val() || '' == $("#name").val()) {
        layer.msg('请输入账号', {time: 1000, icon: 5});
        return false;
    }
    if (null == $("#psd").val() || '' == $("#psd").val()) {
        layer.msg('请输入密码', {time: 1000, icon: 5});
        return false;
    }
    var inputCode = document.getElementById("J_codetext").value.toUpperCase();
    var codeToUp = code.toUpperCase();
    if (inputCode.length <= 0) {
        layer.msg('请输入验证码', {time: 1000, icon: 5});
        createCode();
        return false;
    }
    if (inputCode != codeToUp) {
        document.getElementById("J_codetext").value = "";
        layer.msg('验证码输入错误', {time: 1000, icon: 5});
        createCode();
        return false;
    }
    document.getElementById("J_codetext").value = "";
    return true;
}

function login() {
    if (!checkLogin()) {// 判断是否输入账号和密码
        return;
    }
    var data = {"loginAccount": $("#name").val(), "loginPasswd": $("#psd").val()};
    $.ajax({
        cache: true,
        type: "POST",
        url: '/login',
        dataType: "json",
        contentType: "application/json",
        data: JSON.stringify(data),
        async: false,
        error: function (request) {
            layer.msg('请求失败', {
                time: 1000,
                icon: 0
            });
        },
        success: function (data) {
            if (null != data.retcode && "1" == data.retcode) {
                sessionStorage.setItem("tokenId", data.tokenId);
                sessionStorage.setItem("name", data.name);
                window.location.href = "iniIndex";
            } else {
                createCode();
                layer.msg(data.retmsg, {
                    time: 1000,
                    icon: 0
                });
            }
        }
    });
    /* window.location.href="index.html"; */
}
$(document).keydown(function (event) {
    if (event.keyCode == 13) { //绑定回车
        login();
    }
});

function showCheck(a) {/* 显示验证码图片 */
    var c = document.getElementById("myCanvas");
    var ctx = c.getContext("2d");
    ctx.clearRect(0, 0, 1000, 1000);
    ctx.font = "80px Arial";
    ctx.fillText(a, 0, 100);
}

var code; //在全局 定义验证码
function createCode() {
    code = "";
    var codeLength = 4;//验证码的长度
    var selectChar = new Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');

    for (var i = 0; i < codeLength; i++) {
        var charIndex = Math.floor(Math.random() * 60);
        code += selectChar[charIndex];
    }
    if (code.length != codeLength) {
        createCode();
    }
    showCheck(code);
}

/*验证是否正确*/
function validate() {
    var inputCode = document.getElementById("J_codetext").value.toUpperCase();
    var codeToUp = code.toUpperCase();
    if (inputCode.length <= 0) {
        document.getElementById("J_codetext").setAttribute("placeholder", "Type Here");
        createCode();
        return false;
    }
    else if (inputCode != codeToUp) {
        document.getElementById("J_codetext").value = "";
        document.getElementById("J_codetext").setAttribute("placeholder", "Error");
        createCode();
        return false;
    }
    else {
        window.open(document.getElementById("J_down").getAttribute("data-link"));
        document.getElementById("J_codetext").value = "";
        createCode();
        return true;
    }
}

/*加载验证码*/
$(document).ready(function () {
    $(".J_download").bind("click", function () {
        $(".J_before").hide(40);
        $(".J_after").show(200);
        createCode();
    });
    $(".btn-no").bind("click", function () {
        $(".J_after").hide(40);
        $(".J_before").show(200);
    });
    createCode();
})