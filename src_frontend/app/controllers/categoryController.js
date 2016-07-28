/**
 * Created by student007 on 16.25.7.
 */
foodDeliveryApp.controller('CategoryController', ['$scope', 'categoryCrud', '$routeParams', function ($scope, categoryCrud, $routeParams) {
    $scope.getAllCategories = function () {
        $scope.categories = categoryCrud.query();
    };
    $scope.getCategory = function () {
        $scope.category = categoryCrud.get({id: $routeParams.id});
    };
    $scope.getAllCategories();
    $scope.getCategory();
}]);