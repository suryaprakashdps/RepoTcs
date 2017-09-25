angular.module('app.controllers', []).controller(
		'UserListController',
		function($scope, $state, popupService, $window, DBService,
				deleteService) {
			$scope.userdata = DBService.query(); // fetch all users.
			// Issues a GET to
			// /api/vi/projects

			// delete query

			$scope.deleteuser = function(user) {
				if (popupService.showPopup('Are you sure to delete?')) {

					deleteService.deleteUser(user).then(
							function success(response) {

								$scope.userdata = DBService.query();
								$state.go('projects');

							});

				}

			};

		}).controller('UserViewController',
		function($scope, $stateParams, DBService) {
			$scope.userdata = DBService.get({
				id : $stateParams.id
			}); // Get a single user.Issues a GET to /api/v1/projects/:id
		}).controller('UserCreateController',
		function($scope, $state, $stateParams, DBService) {
			$scope.userdata = new DBService(); // create new user
			// instance. Properties will be
			// set via ng-model on UI

			$scope.adduser = function() { // create a new user. Issues a
				// POST to /api/v1/projects
				$scope.userdata.$save(function() {
					$state.go('projects'); // on success go back to the list
					// i.e. projects state.
				});
			};
		});
