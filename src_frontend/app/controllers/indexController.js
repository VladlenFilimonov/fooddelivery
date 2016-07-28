/**
 * Created by student007 on 16.25.7.
 */
foodDeliveryApp.controller('IndexController', ['$scope', 'categoryCrud', function ($scope, categoryCrud) {
    $scope.greetings = "Hello Angular!";
    $scope.getAllCategories = function () {
        $scope.categories = categoryCrud.query();
    }
    $scope.getAllCategories();
}]);