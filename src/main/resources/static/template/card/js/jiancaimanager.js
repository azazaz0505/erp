platform.controller('jiancaimanager', ['$scope', '$rootScope', '$http', '$window',
    function ($scope, $rootScope, $http, $window) {
        $window.scroll(0, 0);

       // $scope.cardInfoTemp = {};//定义临时修改变量值
        $scope.serviceInfoTemp = {};//定义临时修改变量值
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
        	    var opt = {
        	        url: $rootScope.apiHome + '/info',
        	        silent: true,
        	        query:{
//        	        	 orderdate:$("#datetext").val(),        	       
//                         stylename:$("#stylename").val(),
//                         styleid:$("#styleid").val(),
        	        }
        	    };

        	    $("#tb_report").bootstrapTable('refresh', opt);
        }; 

        /*点击修改按钮，如果是新增则新增，否则修改*/
        $scope.submit = function () {

            // 先收集数据
            var data =
                {
                    "serviceid": $scope.serviceInfoTemp.serviceid,
//                    "cardtitle": $scope.cardInfoTemp.cardtitle,
//                    "cardcontent": $scope.cardInfoTemp.cardcontent,
//                    "cardurl": $scope.cardInfoTemp.cardurl,
//                    "appid": $scope.cardInfoTemp.appid,
//                    "pkgname": $scope.cardInfoTemp.pkgname,
//                    "entryactivity": $scope.cardInfoTemp.entryactivity,
                    "servicename": $scope.serviceInfoTemp.servicename,
//                    "cardtype": $scope.cardInfoTemp.cardtype,
//                    "cardtime": $scope.cardInfoTemp.cardtime
                };
            if (null == idx || idx == -1) {
                //新增数据
                saveServiceInfo($rootScope, $scope, data);
                return;
            }

            //更新数据
            updateServiceInfo($rootScope, $scope, data);
        }

        $scope.deleteData = function ($index) {
            if ($index >= 0) {
                if (confirm("是否删除：" + $scope.datalist[$index].serviceName)) {
                    var data =
                        {
                            "serviceid": $scope.datalist[$index].serviceId
                        };
                    deleteServiceInfo($rootScope, $scope, data, $index);
                }
            }
        };

        /*点击页码调用的方法*/
        $scope.pageChanged = function () {
            console.log('Page changed to: ' + $scope.currentPage);
            getServiceInfoList($rootScope, $scope);
        };
        
        /*选择日期*/
        $('#orderdate').datetimepicker({
        //orderdate.datetimepicker({
        	format: "yyyy-mm-dd",
        	language:'zh-CN',
            minView:2,
            todayBtn:'linked',
            autoclose:true,
            todayHighlight: true
        });

        //先销毁表格  
        $('#tb_report').bootstrapTable('destroy'); 
        $("#tb_report").bootstrapTable({ // 对应table标签的id
            url: $rootScope.apiHome + '/info',   //url一般是请求后台的url地址,调用ajax获取数据。此处我用本地的json数据来填充表格。
            method: "post",                     //使用get请求到服务器获取数据,post大小写有区别
            dataType: "json",
            locale: 'zh-CN',
            toolbar: "#toolbar",                //一个jQuery 选择器，指明自定义的toolbar 例如:#toolbar
            buttonsToolbar:"#btn-toolbar",
            sortable:true,
            showColumns: false,
            contentType: "application/json",
            cache: false, // 设置为 false 禁用 AJAX 数据缓存， 默认为true
            striped: true,  //表格显示条纹，默认为false
            pagination: true, // 在表格底部显示分页组件，默认false
            pageList: [10, 20], // 设置页面可以显示的数据条数
            pageSize: 10, // 页面数据条数
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
                    //pageSize: params.limit, // 每页要显示的数据条数
                    //offset: params.offset, // 每页显示数据的开始行号
                	pageSize:params.pageSize,
                    pageNumber:params.pageNumber,
                    orderdate:$("#datetext").val(),
                    //orderdate:$scope.orderdate,
                    stylename:$("#stylename").val(),
                    styleid:$("#styleid").val(),
                };
            	
            },
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
       //$('.dropdown-toggle').dropdown();
    }]
);



function initServiceInfo($scope, index) {
    $scope.serviceInfoTemp.serviceid = (null == index || -1 == index) ? null : $scope.datalist[index].serviceId;
//    $scope.cardInfoTemp.cardtitle = (null == index || -1 == index) ? null : $scope.datalist[index].cardTitle;
//    $scope.cardInfoTemp.cardcontent = (null == index || -1 == index) ? null : $scope.datalist[index].cardContent;
//    $scope.cardInfoTemp.cardurl = (null == index || -1 == index) ? null : $scope.datalist[index].cardUrl;
//    $scope.cardInfoTemp.appid = (null == index || -1 == index) ? null : $scope.datalist[index].appId;
//    $scope.cardInfoTemp.pkgname = (null == index || -1 == index) ? null : $scope.datalist[index].pkgName;
//    $scope.cardInfoTemp.entryactivity= (null == index || -1 == index) ? null : $scope.datalist[index].entryActivity;
    $scope.serviceInfoTemp.servicename = (null == index || -1 == index) ? null : $scope.datalist[index].serviceName;
//    $scope.cardInfoTemp.cardtype = (null == index || -1 == index) ? null : $scope.datalist[index].cardType;
//    $scope.cardInfoTemp.cardtime = (null == index || -1 == index) ? null : $scope.datalist[index].cardTime;
    
    
    
    
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
        "styleid":$scope.styleid,
        "stylename":$scope.stylename,
        "orderdate":$scope.orderdate,
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
    $('#configEdit').modal('hide');
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
