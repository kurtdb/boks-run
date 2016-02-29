(function(angular) {
  angular.module('runnerApp', ['ui.bootstrap']).config(function($httpProvider) {

	  $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';

	});
}(angular));