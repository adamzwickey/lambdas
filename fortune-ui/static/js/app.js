angular.module('fortunes', ['ngRoute']).config(function ($routeProvider) {

    $routeProvider.when('/', {
        templateUrl: 'fortune.html',
        controller: 'fortune'
    })

}).controller('fortune', function ($scope, $http) {

    $http.get('https://urgxmoce6c.execute-api.us-east-1.amazonaws.com/prod/randomFortune').success(function (data) {
        console.log("Fortune: " + data);
        $scope.fortune = data;
    });

});