angular.module('foodDeliveryApp').run(['$templateCache', function ($templateCache) {
    $templateCache.put('views/category.html', '<h1>{{greetings}}</h1>\n<p>Just info about categories</p>');
    $templateCache.put('views/index.html', '<h1>{{greetings}}</h1>\n<ul>\n    <li ng-repeat="category in categories"><a href="#/category/{{category.id}}">{{category.name}}</a></li>\n</ul>');
}]);