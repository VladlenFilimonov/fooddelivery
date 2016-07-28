/**
 * Created by student007 on 16.28.7.
 */
foodDeliveryApp.controller('RestaurantController', [
    '$scope',
    'restaurantCrud',
    'categoryCrud',
    'commentCrud',
    'ratingServices',
    '$routeParams',
    function ($scope, restaurantCrud, categoryCrud, commentCrud, ratingServices, $routeParams) {
        // var restaurantId = $routeParams.id;
        $scope.comments = [];
        $scope.getAllCategories = function () {
            $scope.categories = categoryCrud.query();
        };
        $scope.getRestaurant = function () {
            $scope.restaurant = restaurantCrud.get({id: $routeParams.id});
        };
        $scope.getComments = function () {
            $scope.comments = commentCrud.query({id: $routeParams.id})
        };
        $scope.comment = {};
        console.log(commentCrud);
        $scope.addComment = function () {
            $scope.requestProcessing = true;
            $scope.comment.userId = 1;
            $scope.comment.restaurantId = $routeParams.id;
            commentCrud.save({id: $routeParams.id}, $scope.comment, function (response) {
                if (response) {
                    $scope.comments = response;
                    $scope.comment = {};
                }
            });
            $scope.requestProcessing = false;
        };
        $scope.rating = {};
        $scope.addRating = function () {
            $scope.rating.userId = 1;
            $scope.rating.restaurantId = $routeParams.id;
            ratingServices.save($routeParams.id, $scope.rating).then(function (response) {
                if (response) {
                    $scope.restaurant.averageRatings = response;
                }
            });
            $scope.requestProcessing = false;
        };
        $scope.getAllCategories();
        $scope.getRestaurant();
        $scope.getComments();

    }]);