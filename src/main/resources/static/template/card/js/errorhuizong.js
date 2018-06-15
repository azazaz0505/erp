platform.controller('errorhuizong', ['$scope', '$rootScope', '$http', '$window',
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
            getServiceInfoList($rootScope, $scope);
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
            todayHighlight: true,
            keyboardNavigation:true
        }).on('change',function(e){
        	getServiceInfoList($rootScope, $scope);
        }
        		
        );

        /*默认进入页面后查询一次*/
        getServiceInfoList($rootScope, $scope);
        

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



/*新的查询剪裁管理数据*/
function getServiceInfoList($rootScope, $scope) {
    var data = {
        "currentPage":$scope.currentPage,
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

/*启用/禁用弹窗内的控件*/
function isDisabled(disabled) {
    var elements = document.getElementsByClassName("isDisabled");
    for (var i = 0; i < elements.length; i++) {
        elements[i].disabled = disabled;
    }
}
