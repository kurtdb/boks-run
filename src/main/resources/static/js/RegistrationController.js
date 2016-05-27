(function(angular) {
	'use strict';

	angular
			.module('runnerApp')
			.controller(
					'RegistrationController',
					[
							'$scope',
							'$log',
							'$uibModalInstance',
							'RegistrationService',
							function RunnerController($scope, $log,
									$uibModalInstance, RegistrationService) {

								$scope.url = null;
								$scope.name = null;
								$scope.result = null;
								$scope.class = null;

								$scope.create = function(firstname, name,
										street, town, gender, club, age, email,
										category, boksLid, stofwisselingsZiekte) {

										console.log('Trying to save!');
										var promise = RegistrationService.add(
												firstname, name, street, town,
												gender, club, age, email,
												category, boksLid,
												stofwisselingsZiekte);
										promise
												.then(
														function(result) {
															$scope.saving = false;
															$scope.result = 'Succesvol geregistreerd';
															$scope.class = 'alert alert-success';
															var calculatedPromise = RegistrationService.calculatePrice(
																	firstname, name, street, town,
																	gender, club, age, email,
																	category, boksLid,
																	stofwisselingsZiekte);
															calculatedPromise.then(function(result) {
																$scope.result = 'Registratie succesvol. Gelieve ' + result + ' euro over te schrijven op rekeningnummer BE33 9201 0189 5146';
															},
															function(error) {
																$scope.result = error;
																$scope.class = 'alert alert-danger';
															});
														},
														function(error) {
															$scope.saving = false;
															$scope.result = error;
															$scope.class = 'alert alert-danger';
														});

								};

								$scope.annuleer = function() {
									console.log('closing dialog!');
									$uibModalInstance.close();
								}

								$scope.today = function() {
									$scope.dt = new Date();
								};
								$scope.today();

								$scope.clear = function() {
									$scope.dt = null;
								};

							} ]);

})(angular);