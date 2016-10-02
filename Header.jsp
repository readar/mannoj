<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>


    
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<title>Novel Store</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
 <a class="navbar-brand" href="#">RE@DAR NOVELS</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="novels">Home</a></li>
     <li><a href="viewprod"> Product</a></li>
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
						<li style="float: right"><a href="RegisterPage">Sign up</a></li>
						<li style="float: right"><a href="log">Login</a></li>
					</c:otherwise>
					</c:choose>
    </ul>
  </div>
</nav>