(function(angular) {
  angular.module('runnerApp', ['ngRoute', 'ngMdIcons', 'ui.bootstrap']).config(function($routeProvider, $httpProvider) {

		$routeProvider.when('/', {
			templateUrl : 'templates/register.html',
			controller : 'RunnerController'
		}).otherwise({
		    redirectTo: '/'
		});

	  $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';

	});
}(angular));