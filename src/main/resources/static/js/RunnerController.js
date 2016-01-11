(function (angular) {
  'use strict';

  angular
    .module('runnerApp')
    .controller('RunnerController', ['$scope', '$log', 'RunnerService', function RunnerController($scope, $log, RunnerService) {
      $scope.url = null;
      $scope.name = null;
      $scope.result = null;
      $scope.class = null;

      $scope.create = function (firstname, name, street, town, gender, club, age, email, category) {

        if (firstname && name && street && town && gender && age && email) {
        	console.log('Trying to save!');
        	var promise = RunnerService.add(firstname, name, street, town, gender, club, age, email, category);
            promise.then(function (result) {
            	$scope.saving = false;
                $scope.result = 'Succesvol geregistreerd';
                $scope.class = 'alert alert-success';
              }, function (error) {
            	  $scope.saving = false;
            	  $scope.result = error;
            	  $scope.class = 'alert alert-danger';
              });
        }

      };
    }]);
})(angular);