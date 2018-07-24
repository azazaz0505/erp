platform.controller('editSpecificationInfo', ['$scope', '$rootScope', '$http', '$window', '$stateParams', '$state',
        function ($scope, $rootScope, $http, $window, $stateParams, $state) {
            $window.scroll(0, 0);

            $scope.dataTemp = $stateParams.dataTemp;

            $scope.cancel = function () {
                if(typeof(UE.getEditor("editor")) !='undefined'){
                    UE.getEditor("editor").destroy();
                }
                cancel($state);
            }

            //实例化编辑器
            var ue;
            console.log('初始化：' + ue);
            if(null == ue){
                ue = UE.getEditor('editor');
            }

            // 修改时向编辑器内填入content
            ue.ready(function () {
                if(null != $scope.dataTemp.content && '' != $scope.dataTemp.content){
                    console.log('进来了啊');
                    ue.execCommand('insertHtml', $scope.dataTemp.content);
                }
            });

            if (null != $scope.dataTemp.isDisabled && $scope.dataTemp.isDisabled == 1) {
                $('#saveBtn').hide();
                isDisabled(true);
            }

            var elements = document.getElementsByClassName("isDisabled");
            elements[0].disabled = true;

            $scope.submit = function () {

                var content = ue.getContent();

                // 先收集数据
                var data =
                    {
                        "uuid": $scope.dataTemp.uuid,
                        "parentUuid": $scope.dataTemp.parentUuid,
                        "title": $scope.dataTemp.title,
                        "content": content,
                        "type": $scope.dataTemp.type
                        // "publishTime": $scope.dataTemp.p ublishTime
                        // "uuid": "1",
                        // "parentUuid": "2",
                        // "title": "3",
                        // "content": "4",
                        // "type": "5"
                    };
                if (null == $scope.dataTemp.index || $scope.dataTemp.index == -1) {
                    //新增数据
                    saveSpecificationInfo($rootScope, data, $state);
                    return;
                }

                //更新数据
                updateSpecificationInfo($rootScope, data, $state);
            }
        }]
);

function cancel($state) {
    $state.go('specificationInfo');
}

/*插入单条数据*/
function saveSpecificationInfo($rootScope, data, $state) {
    $.ajax({
        type: "POST",
        url: $rootScope.apiHome + 'specificationInfo/addSpecificationInfo',
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
            if(typeof(UE.getEditor("editor")) !='undefined'){
                UE.getEditor("editor").destroy();
            }
            if (null == data && null == data.retcode) {
                layer.msg('添加失败', {
                    time: 1000,
                    icon: 0
                });
                return;
            }
            if (1 == data.retcode) {
                layer.msg('添加成功', {
                    time: 1000,
                    icon: 0
                });
                cancel($state);
            }
            if (2 == data.retcode) {
                layer.msg('UUID重复，请重新填写', {
                    time: 1000,
                    icon: 0
                });
            }
        }
    });
}

/*更新数据*/
function updateSpecificationInfo($rootScope, data, $state) {
    $.ajax({
        type: "POST",
        url: $rootScope.apiHome + 'specificationInfo/updateSpecificationInfo',
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
            if(typeof(UE.getEditor("editor")) !='undefined'){
                UE.getEditor("editor").destroy();
            }
            if (null != data && null != data.retcode && 1 == data.retcode) {
                // 数据更新成功后查询，因为涉及到值转换，需要查询
                $('#configEdit').modal('hide');
                layer.msg('更新成功', {
                    time: 1000,
                    icon: 0
                });
                cancel($state);
                return;
            }
            layer.msg('更新失败', {
                time: 1000,
                icon: 0
            });
        }
    });
}

