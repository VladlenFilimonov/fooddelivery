angular.module('foodDeliveryApp').run(['$templateCache', function ($templateCache) {
    $templateCache.put('views/category.html', '<h1>{{greetings}}</h1>\n<p>Just info about categories</p>');
    $templateCache.put('views/index.html', '<h1>{{greetings}}</h1>');
}]);