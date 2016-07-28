foodDeliveryApp.factory('commentCrud', ['appConfig', '$resource', function (appConfig, $resource) {
    return $resource(appConfig.apiUrl + '/comment/:id', {id: '@_id'}, {
        save: {method: 'POST', cache: false, isArray: true}
    });
}]);
