platform.controller('gyswanglai', ['$scope', '$rootScope', '$http', '$window',
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
    
        //导出Excel数据
        /*$scope.ShowExport = function ShowExport() {
        	$('#tb_report').tableExport({
    		 type:'csv',
    		 escape:'false',
    		 fileName:new Date().toLocaleString(),
    		 //headers: true,                              // (Boolean), display table headers (th or td elements) in the <thead>, (default: true)
    		// footers: true,                              // (Boolean), display table footers (th or td elements) in the <tfoot>, (default: false)
    		 //bootstrap: true,                           // (Boolean), style buttons using bootstrap, (default: true)
    		 //exportButtons: true,                        // (Boolean), automatically generate the built-in export buttons for each of the specified formats (default: true)
    		 position: 'bottom',                         // (top, bottom), position of the caption element relative to table, (default: 'bottom')
    		 ignoreColumn: [0],                           // (Number, Number[]), row indices to exclude from the exported file(s) (default: null)
    		 //ignoreCols: null,                           // (Number, Number[]), column indices to exclude from the exported file(s) (default: null)
    		 //trimWhitespace: true	
        	});
        };*/

        //先销毁表格  
        $('#tb_report').bootstrapTable('destroy'); 
        $("#tb_report").bootstrapTable({ // 对应table标签的id
            url: $rootScope.apiHome + '/info',   //url一般是请求后台的url地址,调用ajax获取数据。此处我用本地的json数据来填充表格。
            method: "post",                     //使用get请求到服务器获取数据,post大小写有区别
            dataType: "json",
            locale: 'zh-CN',
           // toolbar: "#toolbar",                //一个jQuery 选择器，指明自定义的toolbar 例如:#toolbar
            sortable:true,
            showColumns: false,
            //showRefresh:true,
           // showToggle:true,
            //contentType: 'application/json,charset=utf-8',
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
           /* showExport: true,
            exportDataType:'all',
            buttonsAlign:"right",  //按钮位置
            exportTypes:['excel'],  //导出文件类型
            Icons:'glyphicon-export',*/
            sidePagination: 'server', // 设置为服务器端分页
            queryParamsType : "undefined",//默认值为 'limit' ,在默认情况下 传给服务端的参数为：offset,limit,sort
                                // 设置为 ''  在这种情况下传给服务器的参数为：pageSize,pageNumber 
            queryParams: function (params) { // 请求服务器数据时发送的参数，可以在这里添加额外的查询参数，返回false则终止请求

                return {
                    //pageSize: params.limit, // 每页要显示的数据条数
                    //offset: params.offset, // 每页显示数据的开始行号
                	pageSize:params.pageSize,
                    pageNumber:params.pageNumber,
                    //sort: params.sort, // 要排序的字段
                    //sortOrder: params.order, // 排序规则
                    //dataId: "ss" // 额外添加的参数
                    //orderdate:"1",
                    //stylename:"1",
                    //styleid:"1"
                };
            	
            },
            columns: [
                {
                    checkbox: true, // 显示一个勾选框
                    align: 'center' // 居中显示
                }, 
                { title: '序号', 
                  width: 50, 
                  align: "center", 
                  formatter: function (value, row, index) 
                  { 
                	  return index + 1;
                  } 
                },  
                {
                    field: 'color', // 返回json数据中的name 
                    title: '付款类型', // 面料供应商、生产供应商
                    align: 'center', // 左右居中
                    valign: 'middle', // 上下居中      
                    switchable:true
                }, {
                    field: 'stylename',
                    title: '供应商名称',   
                    align: 'center',
                    valign: 'middle'
                    
                },
                {
                    field: 'orderdate',
                    title: '事由',
                    align: 'center',
                    valign: 'middle',
                },{
                    field: 'styleid',
                    title: '支付方式',        
                    align: 'center',
                    valign: 'middle',
                    formatter: function (value, row, index){ // 单元格格式化函数
                        var text = '-';
                        if (value == 1) {
                            text = "方式一";
                        } else if (value == 2) {
                            text = "方式二";
                        } else if (value == 3) {
                            text = "方式三";
                        } else if (value == 4) {
                            text = "方式四";
                        }
                        return text;
                    }
                },
                {
                    field: 'orderdate',
                    title: '发票信息',
                    align: 'center',
                    valign: 'middle',
                },
                {
                    field: 'orderdate',
                    title: '发票税率',
                    align: 'center',
                    valign: 'middle',
                },
                {
                    field: 'orderdate',
                    title: '合同总金额',
                    align: 'center',
                    valign: 'middle',
                },
                {
                    field: 'orderdate',
                    title: '已付款金额',
                    align: 'center',
                    valign: 'middle',
                },
                {
                    field: 'orderdate',
                    title: '付款日期',
                    align: 'center',
                    valign: 'middle',
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
                },
                {
                    field: 'orderdate',
                    title: '入库总金额',
                    align: 'center',
                    valign: 'middle',
                },
                {
                    field: 'orderdate',
                    title: '状态',
                    align: 'center',
                    valign: 'middle',
                    formatter: function (value, row, index){ // （待付、待审批、已付）
                        var text = '-';
                        if (value == 1) {
                            text = "方式一";
                        } else if (value == 2) {
                            text = "方式二";
                        } else if (value == 3) {
                            text = "方式三";
                        } else if (value == 4) {
                            text = "方式四";
                        }
                        return text;
                    }
                },
                {
                    field: 'orderdate',
                    title: '申请日期',
                    align: 'center',
                    valign: 'middle',
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
                },{
                	field: 'orderdate',
                    title: '部门',
                    align: 'center',
                    valign: 'middle',
                	
                },
                {
                	field: 'orderdate',
                    title: '经办人',
                    align: 'center',
                    valign: 'middle',
                	
                },
                /*{
                	title:'操作',
                	align: 'center',
                    valign: 'middle',
                	formatter:function(){
                		var result = "";
                		result = " <p class='bt-span'> "
                    	+ "<span title='编辑' ng-click='saveOrUpdataService($index)' class='glyphicon glyphicon-pencil'></span>"
                        + "<span title='查看' ng-click='detail($index)' class='glyphicon glyphicon-list-alt'></span>"
                        + "<span title='删除' ng-click='deleteData($index)' class='glyphicon glyphicon-remove-circle'></span> </p>";
                        
                   
                		return result;
                	}
                },*/
              ],
           
            onLoadSuccess: function(){  //加载成功时执行
            	console.info("数据加载 成功！");
            },
            onLoadError: function(){  //加载失败时执行
                 // console.info("加载数据失败");
            	layer.msg('加载数据失败', {
                    time: 1000,
                    icon: 0
                });
            }

      });
       //必须要有初始化，否在showcolumns下拉菜单不显示 
       $('.dropdown-toggle').dropdown();
        
    }]
);



/*function initServiceInfo($scope, index) {
    $scope.ckmanagertmp.cangkuaddress = (null == index || -1 == index) ? null : $scope.datalist[index].styleid;
    $scope.ckmanagertmp.cangkuname = (null == index || -1 == index) ? null : $scope.datalist[index].color;
    $scope.ckmanagertmp.kuwei  = (null == index || -1 == index) ? null : $scope.datalist[index].orderdate;
    $scope.ckmanagertmp.cengci  = (null == index || -1 == index) ? null : $scope.datalist[index].stylename;
    $scope.ckmanagertmp.rongliang  = (null == index || -1 == index) ? null : $scope.datalist[index].ssizenumber;

}*/

/*点击添加*/
//$scope.saveOrUpdataService = function (index) {
function addNewGys(){
    	$("#addGys").modal({show:true});
        $("#gysTitle").text("添加供应商");
};
 
var checkids = [];
//点击提示删除框的确认按钮
function deleteHaulBtn() {    		
	var data =
    {
        
         "tt": checkids
    };
	
	deleteServiceInfo(data);
	
};
        

//删除选中的行
//$scope.toDelete = function(){
function deleteGys(){
	 checkids=[];
	 var rows = $("#tb_report").bootstrapTable('getSelections');
	              for (var i = 0; i < rows.length; i++) {
	            	  checkids[i]= rows[i].color;
	              }
	if(checkids.length<=0){        		
		$('#deletegyscontent').text('请选择要删除的记录！');
		$("#deleteHaulBtn").hide();
	}else{
		$('#deletegyscontent').text('您确认要删除信息吗？');
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
