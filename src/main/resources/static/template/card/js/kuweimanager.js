platform.controller('kuweimanager', ['$scope', '$rootScope', '$http', '$window',
    function ($scope, $rootScope, $http, $window) {
        $window.scroll(0, 0);

       // $scope.cardInfoTemp = {};//定义临时修改变量值
        $scope.serviceInfoTemp = {};//定义临时修改变量值
        $scope.ckmanagertmp = {};//定义临时修改变量值
        var idx = -1;//定义index for list

        /*下拉列表数据初始化*/
        $scope.serviceTypes = [{id: 1, name: 'webservice服务'}, {id: 2, name: 'rest服务'}];
        $scope.serviceModes = [{id: 0, name: '穿透模式'}, {id: 1, name: '代理模式'}];
        $scope.isCaches = [{id: 0, name: '不缓存'}, {id: 1, name: '缓存'}];

        /*分页初始化参数设置*/
        $scope.maxSize;//显示页码的个数
        //$scope.totalItems = 45;//列表条数
        $scope.currentPage = 1;//当前正在显示的页数

        /*点击查询按钮*/
        $scope.toSearch = function () {
            getServiceInfoList($rootScope, $scope);
        };

        /*查看功能，并没有调用修改那个方法，更方便做不同的处理*/
        $scope.detail = function (index) {
            $scope.title = "查看库位";
            //向页面内填充数据
            initServiceInfo($scope, index);
            //禁用所有input框
            isDisabled(true);
            //显示查看模块窗口
            $('#addKuwei').modal('show');
            $('#saveBtn').hide();
            //$('#cancleBtn').hide();
            //$('#saveBtn').hide();
            //$('#appidSpan').hide();
        }
        
        /*点击添加\编辑按钮（如果是点击编辑按钮，则显示窗口并显示值）*/
        $scope.saveOrUpdataService = function (index) {
            //恢复查看的时候隐藏的
            $('#saveBtn').show();
            $('#appidSpan').show();

            // 开启所有禁用的input输入框
            isDisabled(false);
            //关闭卡片生成时间的输入框
           // $('#cardtime').attr("disabled",true);
            //$('#serviceid').attr("disabled",true);
            // 显示模块窗口，并且禁用点击外面关闭窗口configEdit
            $('#addKuwei').modal({
                //backdrop: 'static'
            	show:true
            })
            
            // 如果是点击了添加，则index为-1，不填充值，且界面值清空
            if (index == null || index == -1) {
            	$("#addKuwei").modal({show:true});
                $scope.title = "添加库位";
               // $("#serviceid").attr("disabled", false);
                idx = -1;
                //initServiceInfo($scope, index);
                return;
            }
            $scope.title = "编辑库位";
            $("#kuwei").attr("disabled", true);

            //将选中行的数据绑定到临时对象dataTemp中，在下面的模态窗口中展示出来
            initServiceInfo($scope, index);

            //选中行的索引赋值给全局变量idx
            idx = index;
        };

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
        
        var checkids = [];
        //删除某一条
        $scope.deleteData = function ($index) {
        	
        	$scope.content="您确认要删除该条信息吗？";
        	$("#deleteHaulBtn").show();
        	$("#delcfmOverhaul").modal({
        	        backdrop : 'static',
        	        keyboard : false
        	    });
        	 
        	 //$scope.deleteid = $scope.datalist[$index].styleid;
        	checkids=$scope.datalist[$index].styleid;
          /*  if ($index >= 0) {
                if (confirm("是否删除库位：" + $scope.datalist[$index].styleid)) {
                    var data =
                        {
                            "serviceid": $scope.datalist[$index].styleid
                        };
                    //deleteServiceInfo($rootScope, $scope, data, $index);
                    deleteServiceInfo($rootScope, $scope, data);
                }
            }*/
        };

        
        //点击提示删除框的确认按钮
        $("#deleteHaulBtn").click(function() {    		
        	var data =
            {
                "serviceid": $scope.deleteid,
                 "tt": checkids
            };
        	
        	deleteServiceInfo($rootScope, $scope , data);
        	
    	});
        
        /*点击页码调用的方法*/
        $scope.pageChanged = function () {
            console.log('Page changed to: ' + $scope.currentPage);
            getServiceInfoList($rootScope, $scope);
        };
        
        
        /*默认进入页面后查询一次*/
        getServiceInfoList($rootScope, $scope);
       
        //加载进来子界面隐藏
        $("#addKuwei").modal({show:false});
        $("#delcfmOverhaul").modal({show:false});
        
        //全选
        $("#checkAll").click(function () { 
	        	if ($("#checkAll").is(":checked") == true) { 
		        	$("input[name='checkbox']").each(function () { 
		        	$(this).attr("checked", true); 
		        	
		        	}); 
	        	} else { 
		        	$("input[name='checkbox']").each(function () { 
		        	$(this).attr("checked", false); 
		        	}); 
	        	} 
        }); 
        
       
        //删除选中的行
        $scope.toDelete = function(){
        	$("input[name='checkbox']:checked").each(function(i){
        		                     //checkids[i] = $(this).val();
        							 checkids[i]=$("#styleid").text();
        		                 });
        	
        	if(checkids.length<=0){
        		$scope.content="请选择要删除的记录！";
        		$("#deleteHaulBtn").hide();
        	}else{
        		$scope.content="您确认要删除信息吗？";
        		$("#deleteHaulBtn").show();
        	}
        	
        	$("#delcfmOverhaul").modal({
     	        backdrop : 'static',
     	        keyboard : false
     	    })
        };
        
        
        
    }]
);



function initServiceInfo($scope, index) {
    $scope.ckmanagertmp.cangkuaddress = (null == index || -1 == index) ? null : $scope.datalist[index].styleid;
    $scope.ckmanagertmp.cangkuname = (null == index || -1 == index) ? null : $scope.datalist[index].color;
    $scope.ckmanagertmp.kuwei  = (null == index || -1 == index) ? null : $scope.datalist[index].orderdate;
    $scope.ckmanagertmp.cengci  = (null == index || -1 == index) ? null : $scope.datalist[index].stylename;
    $scope.ckmanagertmp.rongliang  = (null == index || -1 == index) ? null : $scope.datalist[index].ssizenumber;

}

/*查询列表*/
/*function getServiceInfoList($rootScope, $scope) {
    var data = {
        "currentPage":$scope.currentPage,
        "serviceID":$scope.serviceID,
        "count":"20"
    };
    $.ajax({
        cache: true,
        type: "POST",
        url: $rootScope.apiHome + 'insert/getServiceInfo',
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
            //$scope.numPages = data.pagination.totalPage;
        }
    });
    //查询时隐藏弹出窗口
    $('#configEdit').modal('hide');
}*/

/*新的查询剪裁管理数据*/
function getServiceInfoList($rootScope, $scope) {
    var data = {
        "currentPage":$scope.currentPage,
      //  "serviceID":$scope.serviceID,
       // "styleid":$scope.styleid,
       // "stylename":$scope.stylename,
       // "orderdate":$scope.orderdate,
        "count":"20"
    };
    $.ajax({
        cache: true,
        type: "POST",
        url: $rootScope.apiHome + '/info',
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
            $scope.datalist = data.infos;
            //$scope.totalItems = data.pagination.totalItems;
            //$scope.numPages = data.pagination.totalPage;
            //$scope.numPages = 1;
            //$scope.currentPage = $scope.currentPage;
        }
    });
    //查询时隐藏弹出窗口
    //$('#addKuwei').modal('hide');
    $("#addKuwei").modal({show:false});
    
}


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
