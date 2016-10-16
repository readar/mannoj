<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Blog Page</title>
    <head> 
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/bootstrap/js/jquery-1.9.1.mini.js"></script>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>


    
    <!-- <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"> -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>
    
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootswatch/3.2.0/sandstone/bootstrap.min.css">
<script	src="//ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
<script	src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>

<style>
.itm{
width:70%;
margin: auto;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <script>
var app = angular.module('myApp', []);

function BlogController($scope, $http) {

	  $scope.sortType     = 'name'; // set the default sort type
	  $scope.sortReverse  = false;  // set the default sort order
	  $scope.searchDeviceName   = '';     // set the default search/filter term

        $scope.getDataFromServer = function() {
                $http({
                        method : 'GET',
                        url : 'getBlogData'
                }).success(function(data, status, headers, config) {
                        $scope.Blogs = data; alert(data);
                }).error(function(data, status, headers, config) {
                        
                });

        };
};
</script>
</head>
<body>

<div class="container" ng-app="myApp" ng-controller="MyController" ng-init="getDataFromServer()">
  
  <form>
    <div class="form-group">
      <div class="input-group">
        <div class="input-group-addon"><i class="fa fa-search"></i></div>
        <input type="text" class="form-control" placeholder="Search Blog Name" ng-model="searchBTitle">      
       </div>      
    </div>
  </form>
  
  <table class="table table-bordered table-striped">
    
    <thead>
      <tr>
      <td>
          <a href="#" ng-click="sortType = 'BlogID'; sortReverse = !sortReverse">
            Blog Id 
            <span ng-show="sortType == 'BlogID' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'BlogID' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        
        <td>
          <a href="#" ng-click="sortType = 'BlogTitle'; sortReverse = !sortReverse">
            Blog Name 
            <span ng-show="sortType == 'BlogTitle' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'BlogTitle' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        <td>
          <a href="#" ng-click="sortType = 'BlogContent'; sortReverse = !sortReverse">
          Content 
            <span ng-show="sortType == 'BlogContent' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'BlogContent' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        <td>
          <a href="#" ng-click="sortType = 'BlogCreatedUser'; sortReverse = !sortReverse">
          User Name
            <span ng-show="sortType == 'BlogCreatedUser' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'BlogCreatedUser' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        <td>
          <a href="#" ng-click="sortType = 'BlogCreationDate'; sortReverse = !sortReverse">
          Creation Date
            <span ng-show="sortType == 'BlogCreationDate' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'BlogCreationDate' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        </tr>
    </thead>
    
    <tbody>
      <tr ng-repeat="b1 in blog | orderBy:sortType:sortReverse | filter:searchBTitle">
           		<td>{{b1.BlogID}}</td>
           		<td>{{b1.BlogTitle}}</td>
           		<td>{{b1.BlogContent}}</td>
           		<td>{{b1.BlogCreatedUser}}</td>
           		<td>{{b1.BlogCreationDate}}</td>
           	
      </tr>
    </tbody>
    
  </table>
  
</div>

</body>
</html>