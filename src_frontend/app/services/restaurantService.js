/**
 * Created by student007 on 16.25.7.
 */
foodDeliveryApp.factory('restaurantCrud', ['appConfig', '$resource', function (appConfig, $resource) {
    return $resource(appConfig.apiUrl + '/restaurant/:id', {id: '@_id'}, {});
}]);
