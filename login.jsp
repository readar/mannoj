<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Header.jsp" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html">

<html>
<head>
<meta charset="ISO-8859-1">
<title>READAR NOVELS</title>
<style>
body{
background-image:url("resources/images/bo3.jpg");
background-repeat:no-repeat;
background-size:cover;
}
td{
font-family:regular;
font-size:20px;

}
</style>
</head>
<body bgcolor="lightblue">
<HR>
<center><h1 style="color:red;font-family:arial">WELCOME TO REVOLUTIONARY NOVELS</h1></center>
<HR>

<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<center>
<form action="perform_login" method="post">

<table>
<tr>
<td style="color:magenta">USERNAME:</td>
<td><input type="text" placeholder="Username" required id="username" name="username" pattern=".{1,10}" /></td>
</tr>
<tr>
<td style="color:magenta">PASSWORD:</td>
<td><input type="password" placeholder="Password" required id="password" name="password" /></td>
</tr>
<tr>
<td><input type="submit" value="Login"/></td>
<td><input type="reset" value="Reset"/></td>
</tr>
</table>
</form>
</CENTER>
<br><br><br>
<br><br><br>  
<%@include file="Footer.jsp" %> 



<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="<c:url value="/resources/css/stylee.css" />" rel="stylesheet">
</head>
<body style="padding-top:75px">
	<div class="container">
		<section id="content">
			<form action="perform_login" method="post">
				<h1>Login Form</h1>
				<div>
					<input type="text" placeholder="Username" required id="username" name="username" 
						pattern=".{1,10}" />
				</div>
				<div>
					<input type="password" placeholder="Password" required id="password" name="password" 
					title="Enter Valid credentials"/>
				</div>
				<div>
					<input type="submit" value="Log in" /> <a href="#">Lost your
						password?</a> <a href="Register">Register</a>
				</div>
				
			</form>
			<!-- form -->
			<div class="button">
				<a href="Register">Get New Account</a>
			</div>
			<!-- button -->
		</section>
		<!-- content -->
	</div>
	<!-- container -->
</body>
</html> --%>