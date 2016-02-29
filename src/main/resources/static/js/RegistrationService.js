(function(angular) {
	'use strict';

	angular.module('runnerApp').service('RegistrationService',
			[ '$http', '$q', '$log', function UrlService($http, $q, $log) {
				var add = function(firstname, name, street, town, gender, club, age, email, categories, boksLid, stofwisselingsZiekte) {
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
							categories : categories,
							boksLid : boksLid,
							stofwisselingsZiekte : stofwisselingsZiekte
						}
					});
					request.success(function(data) {
						return deferred.resolve(data);
					}).error(function(data) {
						return deferred.reject(data.message);
					});

					return deferred.promise;
				};
				
				return {
					add: add
				}
			} ]);
})(angular);