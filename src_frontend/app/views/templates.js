angular.module('foodDeliveryApp').run(['$templateCache', function($templateCache) {$templateCache.put('views/category.html','<h1>{{greetings}}</h1>\r\n<p>Just info about categories</p>');
$templateCache.put('views/index.html','<h1>{{greetings}}</h1>\r\n<ul>\r\n    <li ng-repeat="category in categories"><a href="#/category/{{category.id}}">{{category.name}}</a></li>\r\n</ul>');}]);