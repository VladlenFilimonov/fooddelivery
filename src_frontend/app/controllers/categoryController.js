/**
 * Created by student007 on 16.25.7.
 */
foodDeliveryApp.controller('CategoryController', ['$scope', 'categoryCrud', function ($scope, categoryCrud) {
    $scope.greetings = "Hello Category!";
    $scope.getAllCategories = function () {
        $scope.categories = categoryCrud.query();
    }
}]);