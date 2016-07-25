/**
 * Created by student007 on 16.25.7.
 */
foodDeliveryApp.factory('categoryCrud', ['appConfig', '$resource', function (appConfig, $resource) {
    return $resource(appConfig.apiUrl, '/category/:id', {id: '@_id'}, {});
}]);
