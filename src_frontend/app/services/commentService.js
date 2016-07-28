foodDeliveryApp.factory('commentCrud', ['appConfig', '$resource', function (appConfig, $resource) {
    return $resource(appConfig.apiUrl + '/comment/:id', {id: '@_id'}, {});
}]);
