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

function MyController($scope, $http) {

	  $scope.sortType     = 'name'; // set the default sort type
	  $scope.sortReverse  = false;  // set the default sort order
	  $scope.searchDeviceName   = '';     // set the default search/filter term

        $scope.getDataFromServer = function() {
                $http({
                        method : 'GET',
                        url : 'getForumData'
                }).success(function(data, status, headers, config) {
                        $scope.Forums = data; alert(data);
                }).error(function(data, status, headers, config) {
                        
                });

        };
};
</script>

<title>Forum page</title>
</head>
<body>
Forum page
<br>
Hi ${uname} , you are in forum page...
<br>
 <h1><center>Forum Creation Page</center></h1>

<div class="container">
<!-- 
			<div class="row main">
				<div class="panel-heading">
	               <div class="panel-title text-center">
	               		<h1 class="title">Forum Creation Page</h1>
	               		<hr />
	               	</div>
	            </div> 
	            </div>
	            -->
				<div class="main-login main-center">
					<form:form class="form-horizontal" method="post" action="fpost">
						
						
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Category</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
								 <form:select name="ForumCategory">
									 <form:option value="java" />Java
  									 <form:option value=".net" />DotNet
  									<form:option value="CCNA" />CCNA
  									<form:option value="SQL" />SQL
								</form:select> 
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Title</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<form:input type="text" class="form-control" name="ForumTitle" id="ForumTitle"  placeholder="Enter Forum Title" />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Content</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>									
									<form:textarea name="ForumContent" id="ForumContent" rows="30" cols="100" />
								</div>
							</div>
						</div>
						
						<div class="form-group ">
							<input type="submit" value="Post" class="btn btn-primary"  />							
						</div>
					</form:form>
				</div>
			
		</div>					


<!--    TABLE  -->


<div class="container" ng-app="myApp" ng-controller="MyController">  
  

  <div ng-init="getDataFromServer();">
  <table class="table table-bordered table-striped">
    
   <thead>
   
      <tr>
     	 <td>
            <a href="#" ng-click="sortType = 'ForumTitle'; sortReverse = !sortReverse">
             <b>Forum Title</b> 
             <span ng-show="sortType == 'ForumTitle' && !sortReverse" class="fa fa-caret-down"></span>
             <span ng-show="sortType == 'ForumTitle' && sortReverse" class="fa fa-caret-up"></span>
           </a>
        </td>

        <td>
          <a href="#" ng-click="sortType = 'ForumCategory'; sortReverse = !sortReverse">
            <b>Forum Category</b>
            <span ng-show="sortType == 'ForumCategory' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'ForumCategory' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>   

        <td>
          <a href="#" ng-click="sortType = 'ForumContent'; sortReverse = !sortReverse">
            <b>Forum Content</b>
            <span ng-show="sortType == 'ForumContent' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'ForumContent' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>   
       <td>
          <a href="#" ng-click="sortType = 'ForumCreatedUser'; sortReverse = !sortReverse">
          	<b>Created User</b> 
            <span ng-show="sortType == 'ForumCreatedUser' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'ForumCreatedUser' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>        
             
       <td>
          <a href="#" ng-click="sortType = 'ForumCreationDate'; sortReverse = !sortReverse">
          	<b>Creation Date</b> 
            <span ng-show="sortType == 'ForumCreationDate' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'ForumCreationDate' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>            
      
                
       </tr>
      
    </thead>
       
    <tbody>
   
      <tr ng-repeat="f in Forums | orderBy:sortType:sortReverse | filter:searchBlogTitle">
       
        <td>{{ f.ForumTitle}}</td>
        <td>{{ f.ForumCategory}}</td>        
        <td>{{ f.ForumContent }}...<a href="getFullBlogInfoReq?id={{f.ForumID}}">Read Complete</a></td>
        <td>{{ f.ForumCreatedUser }}</td>
        <td>{{ f.ForumCreationDate }}</td>   
      
  </tr>
    </tbody>
    
  </table>
  </div>
</div>



</body>
</html>