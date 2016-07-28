foodDeliveryApp.factory('ratingServices', ['$http', '$q', 'appConfig', function ($http, $q, appConfig) {
    return {
        save: function (id, data) {
            var deferred = $q.defer();
            $http.post(appConfig.apiUrl + '/restaurant/' + id + '/rating', data).success(function (res) {
                deferred.resolve(res);
            }).error(function () {
                deferred.reject("An error occurred while fetching items");
            });
            return deferred.promise;
        }
    }
}]);