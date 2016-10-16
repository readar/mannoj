<!DOCTYPE html>
<html lang="en">
    <head> 
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/bootstrap/js/jquery-1.9.1.mini.js"></script>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<!--  <link rel="stylesheet" type="text/css" href="font-awesome/css/font-awesome.min.css" /> -->
    <script type="text/javascript" src="resources/bootstrap/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
    
    <!-- <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"> -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>
    
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootswatch/3.2.0/sandstone/bootstrap.min.css">
<script	src="http://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
<script	src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
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

function MyController($scope, $http) {

	  $scope.sortType     = 'name'; // set the default sort type
	  $scope.sortReverse  = false;  // set the default sort order
	  $scope.searchDeviceName   = '';     // set the default search/filter term

        $scope.getDataFromServer1 = function() {
                $http({
                        method : 'GET',
                        url : 'getBlogDataInd'
                }).success(function(data, status, headers, config) {
                        $scope.Blogs = data; alert(data);
                }).error(function(data, status, headers, config) {
                        
                });

        };
};
</script>

<title>Insert title here</title>

</head>
<body>
Complete blog information page
<br>
Hi ${uname} , you are in complete blog info page...
<br>


<div class="container" ng-app="myApp" ng-controller="MyController">
  
  <div ng-init="getDataFromServer()1;">
  <br>
  <table ng-repeat="b in Blogs">
  <tbody>
     
  <tr><td>Blog Title</td></tr>
  <tr><td>{{b.BlogTitle}}</td></tr>
  <tr><td>Blog Content</td></tr>
  <tr><td>{{b.BlogContent}}</td></tr>
  <tr><td>User</td></tr>
  <tr><td>{{b.BlogCreatedUser}}</td></tr>
  <tr><td>Creation Date</td></tr>
  <tr><td>{{b.BlogCreationDate}}</td></tr>
  </tbody>
    
  
  </table>

<!-- <a href="blogPageReq">Go Back</a> -->



</body>
</html>