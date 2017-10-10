angular
		.module('app.controllers', [])
		.controller(
				'UserListController',
				function($scope, $state, popupService, $window, DBService, $q,
						$interval, deleteService,modelService) {

					// datagrid setup

					$scope.gridOptions = {
						exporterMenuCsv : true,
						enableGridMenu : true,
						paginationPageSizes : [ 25, 50, 75 ],
						paginationPageSize : 25,
						enableFiltering : true,
						columnDefs : [
								{
									name : 'rec_key'
								},
								{
									name : 'tower'
								},
								{
									name : 'project'
								},
								{
									name : 'service_line'
								},
								{
									name : 'sub_sp'
								},
								{
									name : 'project_type'
								},
								{
									name : 'onsite_won'
								},
								{
									name : 'offsite_won'
								},
								{
									name : 'near_won'
								},
								{
									name : 'onsite_rate'
								},
								{
									name : 'offsite_rate'
								},
								{
									name : 'near_rate'
								},
								{
									name : 'probability'
								},

								{
									name : 'brm_name'
								},
								{
									name : 'actions',
									displayName : 'Actions',
									cellTemplate : '<button id="editBtn" type="button" class="btn btn-primary" ng-click="grid.appScope.masteredit(row.entity)">EDIT</button>'

							} 
								]
					};
//var obj={};
					
	//				modelService.setentity(obj);
					$scope.gridOptions.data = DBService.query();
					
					//created for master data edit but not used

					$scope.masteredit = function(entity) {

						console.log(entity);
						
						modelService.setentity(entity);
						$scope.datavalue=modelService.getentity();
						
						console.log($scope.datavalue);
						$state.go('editmaster');
						


					};

				
					// delete query
					//
					// $scope.deleteuser = function(user) {
					// if (popupService.showPopup('Are you sure to delete?')) {
					//
					// deleteService.deleteUser(user).then(
					// function success(response) {
					//
					// $scope.userdata = DBService.query();
					// $state.go('projects');
					//
					// });
					//
					// }
					//
					// };

				})
				.controller('UserCreateController',
				function($scope, $state, $stateParams, DBService) {
					$scope.editvalue = new DBService(); // create new user
					// instance. Properties will be
					// set via ng-model on UI
					$scope.adduser = function() { // create a new user. Issues
													// a
						// POST to /api/v1/projects
						$scope.editvalue.$save(function() {
							$state.go('projects'); // on success go back to the
													// list
							// i.e. projects state.
						});
					};
				})
				
				.controller('EditMasterController',
				function($scope, $stateParams, DBService,modelService) {
					console.log('inside edit master controller');
					$scope.editvalue=modelService.getentity();
					console.log($scope.editvalue);
					
					$scope.updatemaster = function(){
						
						$scope.editvalue.$update(function(){
							$state.go('projects');
						});
						
					};
//					$scope.userdata = DBService.get({
//						id : $stateParams.id
//					}); // Get a single user.Issues a GET to
						// /api/v1/projects/:id
				})
				
					.controller('ProjectionController',
				function($scope, $stateParams, DBService,modelService) {
//					
				})

				.controller('UserViewController',
				function($scope, $stateParams, DBService) {
					$scope.userdata = DBService.get({
						id : $stateParams.id
					}); // Get a single user.Issues a GET to
						// /api/v1/projects/:id
				});
