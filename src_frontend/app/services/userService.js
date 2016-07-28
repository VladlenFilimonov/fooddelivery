foodDeliveryApp.factory('userServices', ['$http', '$q', 'appConfig', function ($http, $q, appConfig) {
    return {
        save: function (data) {
            var deferred = $q.defer();
            $http.post(appConfig.apiUrl + '/user', data).success(function (res) {
                deferred.resolve(res);
            }).error(function () {
                deferred.reject("An error occured while fetching items");
            });
            return deferred.promise;
        }
    }
}]);