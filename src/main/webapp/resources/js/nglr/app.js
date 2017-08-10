// script.js

    // create the module and name it scotchApp
    var scotchApp = angular.module('scotchApp', ['ngRoute']);

    // configure our routes
    scotchApp.config(function($routeProvider,$locationProvider) {
    	$locationProvider.hashPrefix('');
        $routeProvider

            // route for the home page
            .when('/tasks', {
                templateUrl : 'static/html/tasks.html',
                controller  : 'tasksController'
            })

            // route for the about page
            .when('/projects', {
                templateUrl : 'static/html/projects.html',
                controller  : 'aboutController'
            })
    });
    
    
    // create the controller and inject Angular's $scope
    scotchApp.controller('tasksController', function($scope) {
        // create a message to display in our view
        $scope.message = 'Everyone come and see how good I look!';
    });

    scotchApp.controller('projectsController', function($scope) {
        $scope.message = 'Look! I am an about page.';
    });
