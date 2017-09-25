angular.module('app.services', []).factory('DBService', function($resource) {
  return $resource('/api/v1/projects/:id', { id: '@id' }, {
    update: {
      method: 'PUT'
    }
  });
}).service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
}).service('deleteService',['$http',function($http){
	
	this.deleteUser = function deleteUser(id) {
	    return $http({
	        method : 'DELETE',
	        url : '/api/v1/projects/' + id
	    })
	}
	
	}]);

