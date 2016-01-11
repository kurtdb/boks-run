(function(angular) {
	'use strict';

	angular.module('runnerApp').service('RunnerService',
			[ '$http', '$q', '$log', function UrlService($http, $q, $log) {

				return {

					add : function(firstname, name, street, town, gender, club, age, email, categories) {
						var deferred = $q.defer();

						var request = $http({
							method : 'post',
							url : '/loper/registreer',
							data : {
								firstName: firstname,
								lastName: name,
								address : street,
								city : town,
								gender : gender,
								runningClub : club,
								age : age,
								emailAddress : email, 
								categories : categories
							}
						});
						request.success(function(data) {
							return deferred.resolve(data);
						}).error(function(data) {
							return deferred.reject(data.message);
						});

						return deferred.promise;
					}
				};
			} ]);
})(angular);