/**
 * Created by student007 on 16.28.7.
 */
foodDeliveryApp.controller('UserRegisterController', ['$scope', 'userServices', function ($scope, userServices) {
    $scope.saveUser = function () {
        userServices.save($scope.user).then(function (response) {
            if (response.id) {
                $scope.success = true;
                $scope.error = false;
            } else {
                $scope.error = true;
                $scope.success = false;
            }
        })
    }
}]);