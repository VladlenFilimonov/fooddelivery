/**
 * Created by student007 on 16.25.7.
 */
foodDeliveryApp.controller('CategoryController', ['$scope', 'categoryCrud', '$routeParams', function ($scope, categoryCrud, $routeParams) {
    $scope.greetings = "Hello Category!";
    $scope.getCategory = function () {
        $scope.category = categoryCrud.get({id:$routeParams.id});
    }
    $scope.getCategory();
}]);