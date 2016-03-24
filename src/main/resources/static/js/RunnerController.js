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
								controller: 'RegistrationController',
								size : 'md'
							});
						}
						
						$scope.url = null;
						$scope.name = null;
						$scope.result = null;
						$scope.class = null;

						$scope.create = function(firstname, name, street, town,
								gender, club, age, email, category, boksLid,
								stofwisselingsZiekte) {

							if (firstname && name && street && town && gender
									&& age && email) {
								console.log('Trying to save!');
								var promise = RunnerService.add(
										firstname, name, street, town, gender,
										club, age, email, category, boksLid,
										stofwisselingsZiekte);
								promise.then(function(result) {
									$scope.saving = false;
									$scope.result = 'Succesvol geregistreerd';
									$scope.class = 'alert alert-success';
									$modalInstance.close();
								}, function(error) {
									$scope.saving = false;
									$scope.result = error;
									$scope.class = 'alert alert-danger';
								});
							}
							;

						};
						
						$scope.annuleer = function() {
							console.log('closing dialog!');
							$scope.openDialog.dismiss('cancel');
						}						
					} ]);
})(angular);