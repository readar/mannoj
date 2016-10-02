<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Sign Up!</title>
  
 <style>
 body{
 background-image:url('resources/images/bo8.png');
 background-size:cover;
 }
 </style>
  
</head>
<body>
<br><br><br><br><br><br><br><br><br>
<h1><font color="magenta">Sign Up!</font></h1>

 <!--<form method ="post" action="register">
   <center>
   <table width="350">
   <tr><td><font color="magenta"><h4>FirstName:</h4></font></td><td> <input type="text" name = "firstname" placeholder="Enter your firstname here"></td></tr>
    <tr><td><font color="magenta"><h4>MiddleName:</h4></font></td><td> <input type="text" name = "middlename" placeholder="Enter your middlename here"></td></tr>
     <tr><td><font color="magenta"><h4>LastName:</h4></font></td><td> <input type="text" name = "lastname" placeholder="Enter your lastname here"></td></tr>
   <tr><td><font color="magenta"><h4>Email:</h4></font></td><td> <input type="email" name = "email" placeholder="Enter your email id here"></td></tr>
    <tr><td><font color="magenta"><h4>User Name:</h4></font></td><td> <input type="text" name = "username" placeholder="Set your username here"></td></tr>
   <tr><td><font color="magenta"><h4>Password:</h4></font></td><td> <input type="password" name = "password" placeholder="Set your password here"></td></tr>
   <input type = "hidden" value="false" name ="hb">
   <input type = "hidden" value="true" name ="hbb">
 
        <tr><td><button type="submit" class="btn btn-success">Submit</button></td>
        <td><button type="reset" class="btn btn-default">Reset</button> </td></tr>   
      
      </table>
      </center>
      </form>-->
      
      <form:form action="register" commandName="user" method="POST">
<table>
<tr>
<td>FirstName : </td>
<td><form:input path="firstname" /><form:errors path="firstname" style="color:red"></form:errors></td>
</tr>
<tr>
<td>MiddleName : </td>
<td><form:input path="middlename" /><form:errors path="middlename" style="color:red"></form:errors></td>
</tr>
<tr>
<td>LastName : </td>
<td><form:input path="lastname" /><form:errors path="lastname" style="color:red"></form:errors></td>
</tr>
<tr>
<td>UserName : </td>
<td><form:input path="username" /><form:errors path="username" style="color:red"></form:errors></td>
</tr>
<tr>
<td>Password : </td>
<td><form:password path="password"/><form:errors path="password" style="color:red"></form:errors></td></tr>
<tr>
<td>Confirm Password : </td>
<td><form:password path="confirmpassword"/><form:errors path="confirmpassword" style="color:red"></form:errors></td></tr>
<tr>
<td>EmaiId :</td>
<td><form:input path="email"/><form:errors path="email" style="color:red"></form:errors></td></tr>

<tr colspan="2">
<td><input type="submit" value="Register"></td>
<td><input type="reset" value="Reset"></td>
</tr>
</table>
</form:form>
      
      
</body>
</html>

      
