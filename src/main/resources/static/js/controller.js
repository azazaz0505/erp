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
                    url:"/jiancaimanager",
                    templateUrl:"/template/card/jiancaimanager.html",
                    controller:"jiancaimanager"
                })
                .state("errorhuizong",{
                    url:"/errorhuizong",
                    templateUrl:"/template/card/errorhuizong.html",
                    controller:"errorhuizong"
                })
                .state("kuweimanager",{
                    url:"/kuweimanager",
                    templateUrl:"/template/card/kuweimanager.html",
                    controller:"kuweimanager"
                })
                .state("mianliaoruku",{
                    url:"/mianliaoruku",
                    templateUrl:"/template/card/mianliaoruku.html",
                    controller:"mianliaoruku"
                })
                .state("mianliaochuku",{
                    url:"/mianliaochuku",
                    templateUrl:"/template/card/mianliaochuku.html",
                    controller:"mianliaochuku"
                })
                .state("zichanmanager",{
                    url:"/zichanmanager",
                    templateUrl:"/template/card/zichanmanager.html",
                    controller:"zichanmanager"
                })
                 .state("gyswanglai",{
                    url:"/gyswanglai",
                    templateUrl:"/template/card/gyswanglai.html",
                    controller:"gyswanglai"
                });
        }]);
        angular.bootstrap(document,['apps']);/*加载样式，分页生效*/
});