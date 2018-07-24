platform.controller('mianliaoruku', ['$scope', '$rootScope', '$http', '$window',
    function ($scope, $rootScope, $http, $window) {
        $window.scroll(0, 0);


        /*点击修改按钮，如果是新增则新增，否则修改*/
        $scope.submit = function () {
            // 先收集数据
            var data =
                {
                    "cangkuaddress": $scope.ckmanagertmp.cangkuaddress,
                    "kuwei": $scope.ckmanagertmp.kuwei,
                    "cengci": $scope.ckmanagertmp.cengci,
                    "rongliang": $scope.ckmanagertmp.rongliang,
                    "cangkuname": $scope.ckmanagertmp.cangkuname

                };
            if (null == idx || idx == -1) {
                //新增数据
                saveServiceInfo($rootScope, $scope, data);
                return;
            }
            //更新数据
            updateServiceInfo($rootScope, $scope, data);
        };

        //加载进来子界面隐藏
        /*$("#addKuwei").modal({show:false});
        $("#delcfmOverhaul").modal({show:false});*/

        //先销毁表格  
        $('#tb_report').bootstrapTable('destroy'); 
        $("#tb_report").bootstrapTable({ // 对应table标签的id
            url: $rootScope.apiHome + '/info',   //url一般是请求后台的url地址,调用ajax获取数据。此处我用本地的json数据来填充表格。
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
                      field: 'styleid', // 返回json数据中的name 
                      title: '入库单号', // 表格表头显示文字  
                      align: 'center', // 左右居中
                      valign: 'middle', // 上下居中                   
                  }, {
                      field: 'orderdate',
                      title: '入货仓库',   
                      align: 'center',
                      valign: 'middle',
                  },
                  {
                      field: 'stylename',
                      title: '入库方式',  
                      align: 'center',
                      valign: 'middle',
                  },{
                      field: 'orderdate',
                      title: '入库时间',          
                      align: 'center',
                      valign: 'middle',
                      width: 150,
                      formatter: function (value, row, index) 
                      { 
                      	var date = new Date(value);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
                          Y = date.getFullYear() + '-';
                          M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
                          D = date.getDate() + ' ';
                          h = date.getHours() + ':';
                          m = date.getMinutes() + ':';
                          s = date.getSeconds();
                          return Y+M+D;
                      }
                  }, {
                  	field: 'stylename',
                      title: '备注',  
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
                      	+ '<span title="编辑" onclick="saveOrUpdataRuKu(\''+index+'\')" class="glyphicon glyphicon-pencil"></span>'
                        + '<span title="查看" onclick="detailRuKu(\''+index+'\')" class="glyphicon glyphicon-list-alt"></span>'
                        + '<span title="删除" onclick="deleteOneRuku(\''+index+'\')" class="glyphicon glyphicon-remove-circle"></span> </p><div>';
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



function initRuKufo(index) {
	var rowdata= $('#tb_report').bootstrapTable('getData')[index];//获取该行的数据集
	$('#rukudanhao').val((null == index || -1 == index) ? null:rowdata.styleid);
}

/*查看功能，并没有调用修改那个方法，更方便做不同的处理*/
 function detailRuKu (index) {
    $("#ruKuTitle").text("查看入库面料");
    //向页面内填充数据
    initRuKufo(index);
    //禁用所有input框
    isDisabled(true);
    //显示查看模块窗口
    $('#addRuKu').modal('show');
    $('#saveBtn').hide();
    //$('#cancleBtn').hide();
    //$('#saveBtn').hide();
    //$('#appidSpan').hide();
};

/*点击添加\编辑按钮（如果是点击编辑按钮，则显示窗口并显示值）*/
 function saveOrUpdataRuKu(index) {
    //恢复查看的时候隐藏的
    $('#saveBtn').show();
    // 开启所有禁用的input输入框
    isDisabled(false);
    
    // 显示模块窗口，并且禁用点击外面关闭窗口configEdit
    $('#addRuKu').modal({
        //backdrop: 'static'
    	show:true
    });
    
    // 如果是点击了添加，则index为-1，不填充值，且界面值清空
    if (index == null || index == -1) {
    	//$("#addRuKu").modal({show:true});
    	 $("#ruKuTitle").text("增加入库面料");
        //$("#serviceid").attr("disabled", false);
       
    	initRuKufo(index);
        return;
    };
    
    $("#ruKuTitle").text("编辑入库面料");
    $("#rukudanhao").attr("disabled", true);

    //将选中行的数据绑定到临时对象dataTemp中，在下面的模态窗口中展示出来
    initRuKufo(index);
};

var checkids = [];
//删除某一条
function deleteOneRuku(index) {
	
	$("#ruKuDeleteContent").text("您确认要删除该条信息吗？");
	$("#deleteHaulBtn").show();
	$("#delcfmOverhaul").modal({
	        backdrop : 'static',
	        keyboard : false
	    });
	 
	checkids = [];
	var rowdata= $('#tb_report').bootstrapTable('getData')[index];
	checkids= rowdata.styleid;
};

//点击提示删除框的确认按钮
function deleteHaulBtn() {    		
	var data =
    {
        
         "tt": checkids
    };
	
	deleteServiceInfo(data);
	
};

//删除选中的行
function deleteRuKus(){
	 checkids=[];
	 var rows = $("#tb_report").bootstrapTable('getSelections');
     for (var i = 0; i < rows.length; i++) {
   	  checkids[i]= rows[i].styleid;
     }
	
	if(checkids.length<=0){
		$("#ruKuDeleteContent").text("请选择要删除的记录！");
		$("#deleteHaulBtn").hide();
	}else{
		$("#ruKuDeleteContent").text("您确认要删除信息吗？");
		$("#deleteHaulBtn").show();
	}
	
	$("#delcfmOverhaul").modal({
	        backdrop : 'static',
	        keyboard : false
	    });
};

/*插入单条数据*/
function saveServiceInfo($rootScope, $scope, data) {
    $.ajax({
        type: "POST",
        url: $rootScope.apiHome + 'insert/setServiceInfo',
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
                getServiceInfoList($rootScope, $scope);
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
function updateServiceInfo($rootScope, $scope, data) {
    $.ajax({
        type: "POST",
        url: $rootScope.apiHome + 'insert/updateServiceInfo',
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
                getServiceInfoList($rootScope, $scope);
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
function deleteServiceInfo($rootScope, $scope, data) {
    $.ajax({
        type: "POST",
        url: $rootScope.apiHome + 'insert/deleteServiceInfo',
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
                getServiceInfoList($rootScope, $scope);
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
