/**
 * Created by student007 on 16.25.7.
 */
var foodDeliveryApp = angular.module('foodDeliveryApp', [
    'ngResource',
    'ngRoute'
]);

foodDeliveryApp.config(function ($routeProvider, $locationProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'views/index.html',
            controller: 'IndexController'
        })
        .when('/category/:id', {
            templateUrl: 'views/category.html',
            controller: 'CategoryController'
        })
        .when('/restaurant/:id', {
            templateUrl: 'views/restaurant.html',
            controller: 'RestaurantController'
        })
        .otherwise({
            redirectTo: '/'
        });
    // configure html5 to get links working on jsfiddle
    // $locationProvider.html5Mode(true);
});