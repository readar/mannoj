<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Novels</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<style>
body {
    background-color: lightblue;
}
h1 {
    color: red;
    text-align: center;
}
h5 {
    color:darkgreen;
    text-align: center;
    }
p {
    font-family: regular;
    font-size: 10px;
    text-align: center;
}
 .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      height:350pt;
      margin: auto;
  }
</style>
</head>
<body>
<!-- <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
 <a class="navbar-brand" href="#">RE@DAR NOVELS</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    </div>
    <ul class="nav navbar-nav">
      <li><a href="Welcomepage">Home</a></li>
     </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="RegisterPage"><span class="glyphicon glyphicon-user"></span> SignUp</a></li>
      <li><a href="UserCheck"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      <li><a href="logout"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    </ul>
  </div>
</nav>
 -->
<h1><i><u>REVOLUTIONARY READAR NOVELS</u></i></h1>
<p><h5>THE BEST SITE FOR ONLINE SELLING BOOKS AVAILABLE FOR YOU</h5></p>

  
<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="resources/images/pic1.jpg" width="360" height="150">
      </div>

      <div class="item">
        <img src="resources/images/pic2.jpg"  width="360" height="150">
      </div>
    
      <div class="item">
        <img src="resources/images/pic3.jpg"  width="360" height="150">
      </div>

      <div class="item">
        <img src="resources/images/pic4.jpg"  width="300" height="150">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div><br>
<div class="container">
   
  
  <div class="row">
    <div class="col-md-4">
    <p><h5>CATEGORIES</h5>
      <a href="Categories" class="thumbnail">
        
        <img src="resources/images/pic5.jpg"  style="width:500px;height:150px">
      </a>
    </div>
    <div class="col-md-4">
    <p><h5>GENRES</h5>
      <a href="Genres" class="thumbnail">
        
        <img src="resources/images/pic6.png"  style="width:500px;height:150px">
      </a>
    </div>
    <div class="col-md-4">
    <p><h5>AUTHORS</h5>
      <a href="Author" class="thumbnail">
       
        <img src="resources/images/pic7.jpg"  style="width:500px;height:150px">
      </a>
    </div>
  </div>
</div>

<br><br><br><br>
  
<%@include file="Footer.jsp" %>