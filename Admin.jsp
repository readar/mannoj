
<%@include file="Header.jsp" %>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
<style>
body{
background-image:url('resources/images/bo14.jpg');
background-size:cover;
}
</style>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<br>
<body> --%>
<%--  <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
 <a class="navbar-brand" href="#">RE@DAR NOVELS</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="Welcomepage">Home</a></li>
     <li><a href="viewprods"> Product</a></li>
      <li><a href="Admin">Cart</a></li>
 
     </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="RegisterPage"><span class="glyphicon glyphicon-user"></span> SignUp</a></li>

      <li><a href="perform_logout"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    </ul>
  </div>
</nav> 
<center><h3>Hi ${username}</h3></center> --%>
<br/><br />


<center style="font-weight:bold;color:red;font-size:200%"><i>WELCOME ADMIN</i></center>
<table style="width:100%">

<div class="container">
  
 <tr> 
 <td><div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Manage Categories
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="cat">Add</a></li>
      <li><a href="#">Delete</a></li>
    
 <li><a href="#">View all</a></li>
    </ul>
  </div>
</div></td>

<div class="container">
  
  <td><div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Manage Products
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="add">Add</a></li>
      <li><a href="#">Delete</a></li>
      
 <li><a href="#">View all</a></li>
    </ul>
  </div>
</div>
</td>

<div class="container">
  
  <td><div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Manage Supplier
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="sup">Add</a></li>
      <li><a href="#">Delete</a></li>
      
 <li><a href="#">View all</a></li>
    </ul>
  </div>
</div>
</td>
</tr>
</table>
<br><br><br><br><br><br><br>
  <br><br><br>
  <br><br><br>
  <br><br><br>
  <br><br><br>
  <br><br><br>
  
<%@include file="Footer.jsp" %>



