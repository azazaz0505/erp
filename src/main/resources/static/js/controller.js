/*定义全局变量*/
var platform=angular.module('main',['ui.router','ui.bootstrap']);

/*控制菜单跳转页面*/
$(function () {
    angular.module('apps',["main","ui.router"])
        .config(['$stateProvider','$urlRouterProvider',function ($stateProvider,$urlRouterProvider) {
            $urlRouterProvider.otherwise("/");
            $stateProvider
//                .state("cardInfo",{
//                    url:"/",
//                    templateUrl:"views/template/card/cardInfo.html",
//                    controller:"cardInfo"
//                })
                .state("commServiceInfo",{
                    url:"/ss",
                    templateUrl:"/template/card/commServiceInfo.html",
                    controller:"commServiceInfo"
                })
                .state("cardInfo",{
                    url:"/st",
                    templateUrl:"/template/card/cardInfo.html",
                    controller:"cardInfo"
                })
                .state("login",{
                    url:"/",
                    templateUrl:"/login.html"
                })
        }]);
        angular.bootstrap(document,['apps']);/*加载样式，分页生效*/
});