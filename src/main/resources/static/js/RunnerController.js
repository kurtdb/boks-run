(function(angular) {
	'use strict';

	angular.module('runnerApp').controller(
			'RunnerController',
			[
					'$scope',
					'$log',
					'RunnerService',
					'$uibModal',
					function RunnerController($scope, $log, RunnerService,
							$uibModal) {

						$scope.open = function() {
							console.log('opening dialog!');
							$scope.openDialog =  $uibModal.open({
								templateUrl : 'templates/form.html',
								size : 'lg'
							});
						}
					} ]);
})(angular);