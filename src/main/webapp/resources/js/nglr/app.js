// script.js

    // create the module and name it scotchApp
    var scotchApp = angular.module('scotchApp', ['ngRoute']);

    // configure our routes
    scotchApp.config(function($routeProvider,$locationProvider) {
    	$locationProvider.hashPrefix('');
        $routeProvider

            // route for the home page
            .when('/', {
                templateUrl : 'static/html/home.html',
                controller  : 'mainController'
            })

            // route for the about page
            .when('about', {
                templateUrl : 'static/html/about.html',
                controller  : 'aboutController'
            })

            // route for the contact page
            .when('contact', {
                templateUrl : 'static/html/contact.html',
                controller  : 'contactController'
            });
    });
    
    
    // create the controller and inject Angular's $scope
    scotchApp.controller('mainController', function($scope) {
        // create a message to display in our view
        $scope.message = 'Everyone come and see how good I look!';
    });

    scotchApp.controller('aboutController', function($scope) {
        $scope.message = 'Look! I am an about page.';
    });

    scotchApp.controller('contactController', function($scope) {
        $scope.message = 'Contact us! JK. This is just a demo.';
    });