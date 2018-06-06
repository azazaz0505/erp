platform.controller('specificationInfo', ['$scope', '$rootScope', '$http', '$window', '$state',
    function ($scope, $rootScope, $http, $window, $state) {
        $window.scroll(0, 0);

        $scope.dataTemp = {};//定义临时修改变量值

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
            getSpecificationInfoList($rootScope, $scope);
        };

        /*查看功能，并没有调用修改那个方法，更方便做不同的处理*/
        $scope.detail = function (index) {
            initSpecificationInfo($scope, index);
            $scope.dataTemp.isDisabled = 1;
            $state.go('editSpecificationInfo', {dataTemp: $scope.dataTemp});
        }

        $scope.saveOrUpdata = function (index) {
            // 如果是点击了添加，则index为-1，不填充值，且界面值清空
            if (index == null || index == -1) {
                idx = -1;
                initSpecificationInfo($scope, index);
                $state.go('editSpecificationInfo', {dataTemp: $scope.dataTemp});
                return;
            }

            initSpecificationInfo($scope, index);

            $state.go('editSpecificationInfo', {dataTemp: $scope.dataTemp});
        };

        /*点击修改按钮，如果是新增则新增，否则修改*/
        $scope.submit = function () {

            // 先收集数据
            var data =
                {
                    "uuid": $scope.dataTemp.uuid,
                    "parentUuid": $scope.dataTemp.parentUuid,
                    "title": $scope.dataTemp.title,
                    "content": $scope.dataTemp.content,
                    "content": $scope.dataTemp.content,
                    "type": $scope.dataTemp.type,
                    "publishTime": $scope.dataTemp.publishTime
                };
            if (null == idx || idx == -1) {
                //新增数据
                saveSpecificationInfo($rootScope, $scope, data);
                return;
            }

            //更新数据
            updateSpecificationInfo($rootScope, $scope, data);
        }

        $scope.deleteData = function (index) {
            if (index >= 0) {
                if (confirm("是否删除：" + $scope.datalist[index].title)) {
                    var data =
                        {
                            "uuid": $scope.datalist[index].uuid
                        };
                    deleteSpecificationInfo($rootScope, $scope, data);
                }
            }
        };

        /*点击页码调用的方法*/
        $scope.pageChanged = function () {
            console.log('Page changed to: ' + $scope.currentPage);
            getSpecificationInfoList($rootScope, $scope);
        };

        /*默认进入页面后查询一次*/
        getSpecificationInfoList($rootScope, $scope);

    }]
);

function initSpecificationInfo($scope, index) {
    $scope.dataTemp.index = index;
    $scope.dataTemp.uuid = (null == index || -1 == index) ? null : $scope.datalist[index].uuid;
    $scope.dataTemp.parentUuid = (null == index || -1 == index) ? null : $scope.datalist[index].parentUuid;
    $scope.dataTemp.title = (null == index || -1 == index) ? null : $scope.datalist[index].title;
    $scope.dataTemp.content = (null == index || -1 == index) ? null : $scope.datalist[index].content;
    $scope.dataTemp.type = (null == index || -1 == index) ? null : $scope.datalist[index].type;
    $scope.dataTemp.publishTime = (null == index || -1 == index) ? null : $scope.datalist[index].publishTime;
}

/*查询列表*/
function getSpecificationInfoList($rootScope, $scope) {
    var data = {
        "currentPage": $scope.currentPage
    };
    $.ajax({
        cache: true,
        type: "POST",
        url: $rootScope.apiHome + 'specificationInfo/getSpecificationInfo',
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

/*删除信息*/
function deleteSpecificationInfo($rootScope, $scope, data) {
    $.ajax({
        type: "POST",
        url: $rootScope.apiHome + 'specificationInfo/deleteSpecificationInfo',
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
                getSpecificationInfoList($rootScope, $scope);
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
