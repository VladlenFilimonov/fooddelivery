/**
 * Created by student007 on 16.28.7.
 */
foodDeliveryApp.controller('RestaurantController', [
    '$scope',
    'restaurantCrud',
    'categoryCrud',
    'commentCrud',
    '$routeParams',
    function ($scope, restaurantCrud, categoryCrud, commentCrud, $routeParams) {
        // var restaurantId = $routeParams.id;
        $scope.getAllCategories = function () {
            $scope.categories = categoryCrud.query();
        };
        $scope.getRestaurant = function () {
            $scope.restaurant = restaurantCrud.get({id: $routeParams.id});
        };
        $scope.getComments = function () {
            $scope.comments = commentCrud.query({id: $routeParams.id})
        }
        $scope.getAllCategories();
        $scope.getRestaurant();
        $scope.getComments();
    }]);