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

        /*点击查询按钮*/
        $scope.toSearch = function () {
        	var opt = {
        	        url: $rootScope.apiHome + '/info',
        	        silent: true,
        	        query:{
        	        	 orderdate:$("#datetext").val()
        	        }
        	    };

        	    $("#tb_report").bootstrapTable('refresh', opt);
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
        });/*.on('change',function(e){
        	//getServiceInfoList($rootScope, $scope);
        }
        		
        );*/

        /*默认进入页面后查询一次*/
        //getServiceInfoList($rootScope, $scope);
        //先销毁表格  
        $('#tb_report').bootstrapTable('destroy'); 
        $("#tb_report").bootstrapTable({ // 对应table标签的id
            url: $rootScope.apiHome + '/errorcollect',   //url一般是请求后台的url地址,调用ajax获取数据。此处我用本地的json数据来填充表格。
            method: "post",                     //使用get请求到服务器获取数据,post大小写有区别
            dataType: "json",
            locale: 'zh-CN',
            toolbar: "#toolbar",                //一个jQuery 选择器，指明自定义的toolbar 例如:#toolbar       
            sortable:true,      
            contentType: "application/json",
            cache: false, // 设置为 false 禁用 AJAX 数据缓存， 默认为true
            striped: true,  //表格显示条纹，默认为false
            pagination: true, // 在表格底部显示分页组件，默认false
            //pageList: [10, 15], // 设置页面可以显示的数据条数
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
                    orderdate:$("#datetext").val(),                 
                };
            	
            },
            columns: [
                /*{
                    checkbox: true, // 显示一个勾选框
                    align: 'center' // 居中显示
                },*/ 
                { title: '序号', 
                  width: 80, 
                  align: "center", 
                  formatter: function (value, row, index) 
                  { 
                	  return index + 1;
                  } 
                },  
                {
                    field: 'styleid', // 返回json数据中的name 
                    title: '款号', // 表格表头显示文字  
                    align: 'center', // 左右居中
                    valign: 'middle', // 上下居中                   
                }, {
                    field: 'orderdate',
                    title: '订单时间',   
                    align: 'center',
                    valign: 'middle',
                    formatter: function (value, row, index) 
                    { 
                    	var date = new Date(value);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
                        Y = date.getFullYear() + '-';
                        M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
                        D = date.getDate() + ' ';
                        /*h = date.getHours() + ':';
                        m = date.getMinutes() + ':';
                        s = date.getSeconds();*/
                        return Y+M+D;
                    } 
                    
                },
                {
                    field: 'stylename',
                    title: '款名',  
                    align: 'center',
                    valign: 'middle',
                },{
                    field: 'styleid',
                    title: '交易状态',          
                    align: 'center',
                    valign: 'middle',
                    formatter: function (value, row, index){ // 单元格格式化函数
                        var text = '-';
                        if (value == 1) {
                            text = "交易成功";
                        } else if (value == 0) {
                            text = "交易失败";
                        } 
                        return text;
                    }
                }, {
                	field: 'stylename',
                    title: '订单数',  
                    align: 'center',
                    valign: 'middle',
                    width: 150,
                },
              ],
            onLoadSuccess: function(){  //加载成功时执行
            	console.info("数据加载 成功！");
            },
            onLoadError: function(){  //加载失败时执行
                 // console.info("加载数据失败");
            	/*layer.msg('加载数据失败', {
                    time: 1000,
                    icon: 0
                });*/
            }

      });
       //必须要有初始化，否在showcolumns下拉菜单不显示 
       $('.dropdown-toggle').dropdown();
        

    }]
);


/*启用/禁用弹窗内的控件*/
function isDisabled(disabled) {
    var elements = document.getElementsByClassName("isDisabled");
    for (var i = 0; i < elements.length; i++) {
        elements[i].disabled = disabled;
    }
}
