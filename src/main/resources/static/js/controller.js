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
                .state("jiancaimanager",{
                    url:"/ss",
                    templateUrl:"/template/card/jiancaimanager.html",
                    controller:"jiancaimanager"
                })
                .state("errorhuizong",{
                    url:"/st",
                    templateUrl:"/template/card/errorhuizong.html",
                    controller:"errorhuizong"
                })
                .state("kuweimanager",{
                    url:"/kuweimanager",
                    templateUrl:"/template/card/kuweimanager.html",
                    controller:"kuweimanager"
                })
                .state("mianliaoruku",{
                    url:"/miaoliaoruku",
                    templateUrl:"/template/card/mianliaoruku.html",
                    controller:"miaoliaoruku"
                })
                .state("mianliaochuku",{
                    url:"/mianliaochuku",
                    templateUrl:"/template/card/mianliaochuku.html",
                    controller:"mianliaochuku"
                })
        }]);
        angular.bootstrap(document,['apps']);/*加载样式，分页生效*/
});