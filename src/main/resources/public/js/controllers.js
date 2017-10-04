angular.module('app.controllers', []).controller(
		'UserListController',
		function($scope, $state, popupService, $window, DBService, $q,
				 $interval, deleteService) {
			
			
			// datagrid setup

			$scope.gridOptions = {
				exporterMenuCsv : true,
				enableGridMenu : true,
				enableFiltering : true,
				columnDefs : [ {
					name : 'rec_key'
				}, {
					name : 'tower'
				}, {
					name : 'project'
				}, {
					name : 'service_line'
				}, {
					name : 'sub_sp'
				}, {
					name : 'project_type'
				}, {
					name : 'onsite_won'
				}, {
					name : 'offsite_won'
				}, {
					name : 'near_won'
				}, {
					name : 'onsite_rate'
				}, {
					name : 'offsite_rate'
				}, {
					name : 'near_rate'
				}, {
					name : 'probability'
				},

				{
					name : 'brm_name'
				} ]
			};

			$scope.gridOptions.data = DBService.query();

//			// Issues a GET to
//			// /api/vi/projects
//
//			// $scope.userdata = DBService.query(); // fetch all users.
//
//			// updaterow
//			$scope.saveRow = function(rowEntity,$scope, $state, $stateParams,DBService) {
//				// create a fake promise - normally you'd use the promise
//				// returned by $http or $resource
//				// var promise = $q.defer();
//				// $scope.gridApi.rowEdit.setSavePromise(rowEntity,
//				// promise.promise);
//
//				// fake a delay of 3 seconds whilst the save occurs, return
//				// error if gender is "male"
//				
//				$rec_key=rowEntity.rec_key;
//
//			//	updateService.updatemasterdata(rowEntity.rec_key).
//				
//				DBService.update({id:$rec_key},rowEntity).then(
//						function success(response) {
//							$interval(function() {
//								console.log(rowEntity.brm_name);
//							}, 3000, 1);
//						});
//
//			};
//
//			$scope.gridOptions.onRegisterApi = function(gridApi) {
//				// set gridApi on scope
//				$scope.gridApi = gridApi;
//				console.log('inside onregisterapi');
//				gridApi.rowEdit.on.saveRow($scope, $scope.saveRow);
//			};

			// delete query
//
//			$scope.deleteuser = function(user) {
//				if (popupService.showPopup('Are you sure to delete?')) {
//
//					deleteService.deleteUser(user).then(
//							function success(response) {
//
//								$scope.userdata = DBService.query();
//								$state.go('projects');
//
//							});
//
//				}
//
//			};

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
