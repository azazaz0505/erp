platform.controller('cardInfo', ['$scope', '$rootScope', '$http', '$window',
    function ($scope, $rootScope, $http, $window) {
        $window.scroll(0, 0);

        $scope.cardInfoTemp = {};//定义临时修改变量值

        var idx = -1;//定义index for list

        /*下拉列表数据初始化*/
        $scope.serviceTypes = [{id: 1, name: 'webservice服务'}, {id: 2, name: 'rest服务'}];
        $scope.serviceModes = [{id: 0, name: '穿透模式'}, {id: 1, name: '代理模式'}];
        $scope.isCaches = [{id: 0, name: '不缓存'}, {id: 1, name: '缓存'}];

        /*分页初始化参数设置*/
        $scope.maxSize;//显示页码的个数
        $scope.totalItems = 45;//列表条数
        $scope.currentPage = 1;//当前正在显示的页数

        /*点击查询按钮*/
        $scope.toSearch = function () {
            getCardInfoList($rootScope, $scope);
        };

        /*查看功能，并没有调用修改那个方法，更方便做不同的处理*/
        $scope.detail = function (index) {
            $scope.title = "查看卡片";
            //向页面内填充数据
            initCardInfo($scope, index);
            isDisabled(true);
            //显示查看模块窗口
            $('#configEdit').modal('show');
            $('#saveBtn').hide();
            $('#appidSpan').hide();
        }

        /*点击添加\编辑按钮（如果是点击编辑按钮，则显示窗口并显示值）*/
        $scope.saveOrUpdata = function (index) {
            //恢复查看的时候隐藏的
            $('#saveBtn').show();
            $('#appidSpan').show();

            // 开启所有禁用的input输入框
            isDisabled(false);
            //关闭卡片生成时间的输入框
            $('#cardtime').attr("disabled",true);
            $('#cardid').attr("disabled",true);
            $('#mipuser').attr("disabled",true);
            // 显示模块窗口，并且禁用点击外面关闭窗口
            $('#configEdit').modal({
                backdrop: 'static'
            })

            // 如果是点击了添加，则index为-1，不填充值，且界面值清空
            if (index == null || index == -1) {
                $scope.title = "添加卡片";
                $("#serviceContext").attr("disabled", false);
                idx = -1;
                initCardInfo($scope, index);
                return;
            }
            $scope.title = "查看卡片";
            $("#serviceContext").attr("disabled", true);

            //将选中行的数据绑定到临时对象dataTemp中，在下面的模态窗口中展示出来
            initCardInfo($scope, index);

            //选中行的索引赋值给全局变量idx
            idx = index;
        };

        /*点击修改按钮，如果是新增则新增，否则修改*/
        $scope.submit = function () {

            // 先收集数据
            var data =
                {
                    "cardid": $scope.cardInfoTemp.cardid,
                    "cardtitle": $scope.cardInfoTemp.cardtitle,
                    "cardcontent": $scope.cardInfoTemp.cardcontent,
                    "cardurl": $scope.cardInfoTemp.cardurl,
                    "appid": $scope.cardInfoTemp.appid,
                    "pkgname": $scope.cardInfoTemp.pkgname,
                    "entryactivity": $scope.cardInfoTemp.entryactivity,
                    "mipuser": $scope.cardInfoTemp.mipuser,
                    "cardtype": $scope.cardInfoTemp.cardtype,
                    "cardtime": $scope.cardInfoTemp.cardtime,
                    "intentjson": $scope.cardInfoTemp.intentjson,
                    "remark": $scope.cardInfoTemp.remark
                };
            if (null == idx || idx == -1) {
                //新增数据
                saveCardInfo($rootScope, $scope, data);
                return;
            }

            //更新数据
            updateCardInfo($rootScope, $scope, data);
        }

        $scope.deleteData = function ($index) {
            if ($index >= 0) {
                if (confirm("是否删除：" + $scope.datalist[$index].cardTitle)) {
                    var data =
                        {
                            "cardid": $scope.datalist[$index].cardId
                        };
                    deleteCardInfo($rootScope, $scope, data, $index);
                }
            }
        };

        /*点击页码调用的方法*/
        $scope.pageChanged = function () {
            console.log('Page changed to: ' + $scope.currentPage);
            getCardInfoList($rootScope, $scope);
        };

        /*默认进入页面后查询一次*/
        getCardInfoList($rootScope, $scope);

    }]
);

function initCardInfo($scope, index) {
    $scope.cardInfoTemp.cardid = (null == index || -1 == index) ? null : $scope.datalist[index].cardId;
    $scope.cardInfoTemp.cardtitle = (null == index || -1 == index) ? null : $scope.datalist[index].cardTitle;
    $scope.cardInfoTemp.cardcontent = (null == index || -1 == index) ? null : $scope.datalist[index].cardContent;
    $scope.cardInfoTemp.cardurl = (null == index || -1 == index) ? null : $scope.datalist[index].cardUrlUncode;
    $scope.cardInfoTemp.appid = (null == index || -1 == index) ? null : $scope.datalist[index].appId;
    $scope.cardInfoTemp.pkgname = (null == index || -1 == index) ? null : $scope.datalist[index].pkgName;
    $scope.cardInfoTemp.entryactivity= (null == index || -1 == index) ? null : $scope.datalist[index].entryActivity;
    $scope.cardInfoTemp.mipuser = (null == index || -1 == index) ? null : $scope.datalist[index].mipUser;
    $scope.cardInfoTemp.cardtype = (null == index || -1 == index) ? null : $scope.datalist[index].cardType;
    $scope.cardInfoTemp.cardtime = (null == index || -1 == index) ? null : $scope.datalist[index].cardTime;
    $scope.cardInfoTemp.intentjson = (null == index || -1 == index) ? null : $scope.datalist[index].intentJson;
    $scope.cardInfoTemp.remark = (null == index || -1 == index) ? null : $scope.datalist[index].reMark;
    
    
    
    
}

/*查询列表*/
function getCardInfoList($rootScope, $scope) {
    var data = {
        "currentPage":$scope.currentPage,
        "blurInfo":$scope.blurSearchInfo,
        "count":"20"
    };
    $.ajax({
        cache: true,
        type: "POST",
        url: $rootScope.apiHome + 'card/getCardInfo',
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
            $scope.datalist = data.body;
            $scope.totalItems = data.pagination.totalItems;
        }
    });
    //查询时隐藏弹出窗口
    $('#configEdit').modal('hide');
}


/*插入单条数据*/
function saveCardInfo($rootScope, $scope, data) {
    $.ajax({
        type: "POST",
        url: $rootScope.apiHome + 'card/addCardInfo',
        dataType: "json",
        contentType: "application/json",
        data: JSON.stringify(data),
        async: false,
        error: function () {
            layer.msg('请求失败', {
                time: 1000,
                icon: 0
            });
        },
        success: function (data) {
            if (null != data && null != data.retcode && 1 == data.retcode) {
                getCardInfoList($rootScope, $scope);
                layer.msg('添加成功', {
                    time: 1000,
                    icon: 0
                });
                return;
            }
            layer.msg('添加失败', {
                time: 1000,
                icon: 0
            });
        }
    });
}

/*更新数据*/
function updateCardInfo($rootScope, $scope, data) {
    $.ajax({
        type: "POST",
        url: $rootScope.apiHome + 'card/updateCardInfo',
        dataType: "json",
        contentType: "application/json",
        data: JSON.stringify(data),
        async: false,
        error: function () {
            layer.msg('请求失败', {
                time: 1000,
                icon: 0
            });
        },
        success: function (data) {
            if (null != data && null != data.retcode && 1 == data.retcode) {
                // 数据更新成功后查询，因为涉及到值转换，需要查询
                getCardInfoList($rootScope, $scope);
                $('#configEdit').modal('hide');
                layer.msg('更新成功', {
                    time: 1000,
                    icon: 0
                });
                return;
            }
            layer.msg('更新失败', {
                time: 1000,
                icon: 0
            });
        }
    });
}

/*删除信息*/
function deleteCardInfo($rootScope, $scope, data) {
    $.ajax({
        type: "POST",
        url: $rootScope.apiHome + 'card/deleteCardInfo',
        dataType: "json",
        contentType: "application/json",
        data: JSON.stringify(data),
        async: false,
        error: function () {
            layer.msg('请求失败', {
                time: 1000,
                icon: 0
            });
        },
        success: function (data) {
            if (null != data && null != data.retcode && 1 == data.retcode) {
                layer.msg('删除成功', {
                    time: 1000,
                    icon: 0
                });
                // 查询数据，因为有分页存在所以需要重新分页
                getCardInfoList($rootScope, $scope);
                return;
            }
            layer.msg('删除失败', {
                time: 1000,
                icon: 0
            });
        }
    });
}

/*启用/禁用弹窗内的控件*/
function isDisabled(disabled) {
    var elements = document.getElementsByClassName("isDisabled");
    for (var i = 0; i < elements.length; i++) {
        elements[i].disabled = disabled;
    }
}
