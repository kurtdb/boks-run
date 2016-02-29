(function(angular) {
	'use strict';

	angular.module('runnerApp').service('RunnerService',
			[ '$http', '$q', '$log', function UrlService($http, $q, $log) {
				
				var getClubs = function() {
					var deferred = $q.defer();

					var request = $http({
						method : 'get',
						url : '/club'
					});
					request.success(function(data) {
						return deferred.resolve(data);
					}).error(function(data) {
						return deferred.reject(data.message);
					});

					return deferred.promise;					
				};
				
				return {
					getClubs : getClubs
				};
			} ]);
})(angular);