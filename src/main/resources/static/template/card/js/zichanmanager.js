platform.controller('zichanmanager', ['$scope', '$rootScope', '$http', '$window',
    function ($scope, $rootScope, $http, $window) {
        $window.scroll(0, 0);

    
        //加载进来子界面隐藏
       /* $("#addKuwei").modal({show:false});
        $("#delcfmOverhaul").modal({show:false});*/
        
      //先销毁表格  
        $('#tb_report').bootstrapTable('destroy'); 
        $("#tb_report").bootstrapTable({ // 对应table标签的id
            url: $rootScope.apiHome + '/ziChanGuanLi/select',   //url一般是请求后台的url地址,调用ajax获取数据。此处我用本地的json数据来填充表格。
            method: "post",                     //使用get请求到服务器获取数据,post大小写有区别
            dataType: "json",
            locale: 'zh-CN',
            sortable:true,
            showColumns: false,
            contentType: "application/json",
            cache: false, // 设置为 false 禁用 AJAX 数据缓存， 默认为true
            striped: true,  //表格显示条纹，默认为false
            pagination: true, // 在表格底部显示分页组件，默认false
            //pageList: [10, 20], // 设置页面可以显示的数据条数
            pageSize: 15, // 页面数据条数
            pageNumber: 1, // 首页页码
            paginationPreText: "上一页",
            paginationNextText: "下一页",
            paginationFirstText: "首页",
            paginationLastText: "末页",        
            sidePagination: 'server', // 设置为服务器端分页      
            queryParamsType : "undefined",//默认值为 'limit' ,在默认情况下 传给服务端的参数为：offset,limit,sort
                                // 设置为 ''  在这种情况下传给服务器的参数为：pageSize,pageNumber 
            queryParams: function (params) { // 请求服务器数据时发送的参数，可以在这里添加额外的查询参数，返回false则终止请求
                return {
                	pageSize:params.pageSize,
                    pageNumber:params.pageNumber,
                };
            	
            },
            columns: [
                  {
                      checkbox: true, // 显示一个勾选框
                      align: 'center' // 居中显示
                  }, 
                  { 
                	title: '序号', 
                    width: 80, 
                    align: "center", 
                    formatter: function (value, row, index) 
                    { 
                  	  return index + 1;
                    } 
                  },
                  {
                      field: 'uuid', // 返回json数据中的name 
                      title: 'uuid', // 表格表头显示文字  
                      visible:false,          
                  },
                  {
                      field: 'gudingzichanbiana', // 返回json数据中的name 
                      title: '固定资产编码', // 表格表头显示文字  
                      align: 'center', // 左右居中
                      valign: 'middle', // 上下居中                   
                  }, {
                      field: 'gudingzichanmingcheng',
                      title: '固定资产名称',   
                      align: 'center',
                      valign: 'middle',
                  },
                  {
                      field: 'gudingzichanleixing',
                      title: '固定资产类型',  
                      align: 'center',
                      valign: 'middle',
                  },{
                      field: 'zhejiunianxian',
                      title: '折旧年限',          
                      align: 'center',
                      valign: 'middle',
                      width: 150,
                      /*formatter: function (value, row, index) 
                      { 
                      	var date = new Date(value);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
                          Y = date.getFullYear() + '-';
                          M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
                          D = date.getDate() + ' ';
                          h = date.getHours() + ':';
                          m = date.getMinutes() + ':';
                          s = date.getSeconds();
                          return Y+M+D;
                      }*/
                  }, {
                  	  field: 'yuanzhi',
                      title: '原值',  
                      align: 'center',
                      valign: 'middle',
                      width: 200,
                  },
                  {
                    	field: 'jingcanzhi',
                        title: '净残值',  
                        align: 'center',
                        valign: 'middle',
                        width: 200,
                    },
                  {
                  	title:'操作',
                  	align: 'center',
                    valign: 'middle',
                  	formatter:function(value, row, index){
                  		var result = "";
                  		result = '<div><p class="bt-span">'
                      	+ '<span title="编辑" onclick="saveOrUpdataZiChan(\''+index+'\')" class="glyphicon glyphicon-pencil"></span>'
                        + '<span title="查看" onclick="detailZiChan(\''+index+'\')" class="glyphicon glyphicon-list-alt"></span>'
                        + '<span title="删除" onclick="deleteOneZiChan(\''+index+'\')" class="glyphicon glyphicon-remove-circle"></span> </p><div>';
                  		return result;
                  	},
                  },    
                    
             ],
            onLoadSuccess: function(){  //加载成功时执行
            	console.info("数据加载 成功！");
            },
            onLoadError: function(){  //加载失败时执行
            	layer.msg('加载数据失败', {
                    time: 1000,
                    icon: 0
                });
            }

      }); 
        
    }]
);



function initZiChan(index) {
    /*$scope.ckmanagertmp.cangkuaddress = (null == index || -1 == index) ? null : $scope.datalist[index].styleid;
    $scope.ckmanagertmp.cangkuname = (null == index || -1 == index) ? null : $scope.datalist[index].color;
    $scope.ckmanagertmp.kuwei  = (null == index || -1 == index) ? null : $scope.datalist[index].orderdate;
    $scope.ckmanagertmp.cengci  = (null == index || -1 == index) ? null : $scope.datalist[index].stylename;
    $scope.ckmanagertmp.rongliang  = (null == index || -1 == index) ? null : $scope.datalist[index].ssizenumber;*/
	var rowdata= $('#tb_report').bootstrapTable('getData')[index];//获取该行的数据集
	$('#zichanbianma').val((null == index || -1 == index) ? null:rowdata.gudingzichanbiana);
	$('#ziChanName').val((null == index || -1 == index) ? null:rowdata.gudingzichanmingcheng);
	$('#ziChanType').val((null == index || -1 == index) ? null:rowdata.gudingzichanleixing);
	$('#nianxian').val((null == index || -1 == index) ? null:rowdata.zhejiunianxian);
	$('#yuanzhi').val((null == index || -1 == index) ? null:rowdata.yuanzhi);
	$('#jingcanzhi').val((null == index || -1 == index) ? null:rowdata.jingcanzhi);

}

var idxZiChan = 0;
/*查看功能，并没有调用修改那个方法，更方便做不同的处理*/
function detailZiChan(index) {
	$("#ziChanTitle").text("查看资产");
    //向页面内填充数据
	initZiChan(index);
    //禁用所有input框
    isDisabled(true);
    //显示查看模块窗口
    $('#addZiChan').modal('show');
    $('#saveBtn').hide();
    
};

/*点击添加\编辑按钮（如果是点击编辑按钮，则显示窗口并显示值）*/
function saveOrUpdataZiChan(index) {
    //恢复查看的时候隐藏
    $('#saveBtn').show();

    //开启所有禁用的input输入框
    isDisabled(false);
   
    $('#addZiChan').modal({
        //backdrop: 'static'
    	show:true
    });
    
    // 如果是点击了添加，则index为-1，不填充值，且界面值清空
    if (index == null || index == -1) {
    	
        $("#ziChanTitle").text("添加资产");
       //添加时置空
       // initZiChan(index);
        idxZiChan = -1;
        return;
    }
    $("#ziChanTitle").text("编辑资产");
    $("#zichanbianma").attr("disabled", true);

    //在模态窗口中展示出来
    idxZiChan = index;
    initZiChan(index);

  
};

/*点击修改按钮，如果是新增则新增，否则修改*/
function submitZiChan() {
    // 先收集数据
    var data =
        {
            "gudingzichanbiana": $("#zichanbianma").val(),
            "gudingzichanmingcheng": $("#ziChanName").val(),
            "gudingzichanleixing": $("#ziChanType").val(),
            "zhejiunianxian": $("#nianxian").val(),
            "yuanzhi": $("#yuanzhi").val(),
            "jingcanzhi" : $("#jingcanzhi").val()

        };
    if (null == idxZiChan || idxZiChan == -1) {
        //新增数据
        saveZiChanInfo(data);
        return;
    }
    //更新数据
    updateZiChanInfo(data);
};


var checkids = [];
//删除某一条
function deleteOneZiChan(index) {
	
	$("#ziChanContent").text("您确认要删除该条信息吗？");
	$("#deleteZiChanBtn").show();
	$("#delcfmOverhaul").modal({
	        backdrop : 'static',
	        keyboard : false
	    });
	 
	checkids=[];
	
	var rowdata= $('#tb_report').bootstrapTable('getData')[index];
	checkids= rowdata.uuid;
	
};

//删除选中的行
function deleteZiChans(){
	checkids=[];
	var rows = $("#tb_report").bootstrapTable('getSelections');
    for (var i = 0; i < rows.length; i++) {
  	  checkids[i]= rows[i].uuid;
    }
    
	if(checkids.length<=0){
		$("#ziChanContent").text("请选择要删除的记录！");
		$("#deleteZiChanBtn").hide();
	}else{
		$("#ziChanContent").text("您确认要删除信息吗？");
		$("#deleteZiChanBtn").show();
	}
	
	$("#delcfmOverhaul").modal({
	        backdrop : 'static',
	        keyboard : false
	    });
};

//点击提示删除框的确认按钮
function deleteZiChanBtn() { 
	
	var data =
    {
         "uuids": checkids
    };
	
	deleteZiChanInfo(data);
	
};

/*插入单条数据*/
function saveZiChanInfo(data) {
    $.ajax({
        type: "POST",
        url: '/ziChanGuanLi/select',
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
                //getServiceInfoList($rootScope, $scope);
            	$('#tb_report').bootstrapTable('refresh');
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
function updateZiChanInfo(data) {
    $.ajax({
        type: "POST",
        url: '/ziChanGuanLi/select',
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
            	$('#tb_report').bootstrapTable('refresh');
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
function deleteZiChanInfo(data) {
    $.ajax({
        type: "POST",
        url: '/ziChanGuanLi/select',
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
               // getServiceInfoList($rootScope, $scope);
                $('#tb_report').bootstrapTable('refresh');
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
