<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">


</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
 <a class="navbar-brand" href="#">FriendSter</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="novels"></a></li>
     <li><a href="viewprod"> </a></li>
      <!-- <li><a href="Admin">Cart</a></li> -->
 
     </ul>
    <ul class="nav navbar-nav navbar-right">
<!--       <li><a href="RegisterPage"><span class="glyphicon glyphicon-user"></span> SignUp</a></li>
        <li><a href="log"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>   -->
      <c:choose>
					<c:when test="${LoggedIn}">

						<li style="float: right"><a href="perform_logout"
							class="w3-hover-none"><i class="fa fa-sign-out"></i>Logout</a></li>

						<c:choose>
							<c:when test="${!Administrator}">
								<li style="float: right"><a href="viewcart"
									class="w3-hover-none"><i class="fa fa-shopping-cart"></i>(${cartsize}Cart)</a></li>
								<!-- <li style="float: right"><a href="admin"
									class="w3-hover-none"><i class="fa fa-shopping-cart"></i>AdminPage</a></li> -->
							</c:when>
						</c:choose>

						<li style="float: right"><a href="#" class="w3-hover-none"><i
								class="fa fa-user"></i> Hi, ${username}</a></li>
					</c:when>
					<c:otherwise>
						<li style="float: right"><a href="sign">Sign up</a></li>
						<li style="float: right"><a href="login">Login</a></li>
					</c:otherwise>
					</c:choose>
    </ul>
  </div>
</nav>

<h1 style="color:red;"><center>NIIT - Colloboration Portal</center></h1><hr> --%>





<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security"%> 
	 
	
	
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<title>URL</title>

<nav class="navbar navbar-light" style="background-color:RoyalBlue;">
<br>
<nav class="navbar navbar-light" style="background-color:white;">

<div class="container-fluid">
	<!-- <div class="navbar-header">
		<a class="active" href="welcome">Home</a>
	</div>
 -->	<ul class="nav navbar-nav">
		<li class="active"><a href="#">Home</a></li>
		
	
		<li class="active"><a href="TermsConditions">Terms&Conditions</a></li>
		<!-- <li class="dropdown"><a class="dropdown-toggle"
			data-toggle="dropdown" href="aboutus">My categories <span
				class="caret"></span></a>
			<ul class="dropdown-menu">
				<li><a href="welcome1">Fruits Hub</a></li>
				<li><a href="welcome1">Vegetables Hub</a></li>
				<li><a href="welcome1">Drinks hub</a></li>
			</ul></li> 
		<li><a href="getblog">Blog</a></li>
		<li><a href="getforum">Forum</a></li>-->
		<li><a href="Wall">Wall</a></li>
		<li><a href="Chat">Chat</a></li>

	</ul>
	<ul class="nav navbar-nav navbar-right">
		<c:choose>
			<c:when test="${LoggedIn}">

				<li style="float: right"><a href="perform_logout"
					class="w3-hover-none"><i class="fa fa-sign-out"></i>Logout</a></li>


				<li style="float: right"><a href="#" class="w3-hover-none"><i
						class="fa fa-user"></i> Hi, ${username}</a></li>
			</c:when>
			<c:otherwise>
				<li style="float: left"><a href="getblog">Blog</a></li>
				<li style="float: left"><a href="getforum">Forum</a></li>
				<li style="float: right"><a href="sign">Sign Up</a></li>
				<li style="float: right"><a href="login">Sign In</a></li>
				
			</c:otherwise>
		</c:choose>

	</ul>

</div>
</nav>
</nav>