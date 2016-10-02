<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CategoryPage</title>
</head>
<body>
<br><br><br><br>
<form method ="post" action="catgry">
   <center>
   <table width="350">
                   <tr>
                    <td colspan="2" align="center"><h2>Manage Category</h2></td>
                </tr>
   
    <tr><td><font color="magenta"><h4>Category Name:</h4></font></td><td> <input type="text" name = "tgname"></td></tr>
    <tr><td><font color="magenta"><h4>Category Description:</h4></font></td><td> <input type="text" name = "tgdescription"></td></tr>
  
  
 
        <tr><td><button type="submit" class="btn btn-success">Submit</button></td>
        <td><button type="reset" class="btn btn-default">Reset</button> </td></tr>   
      
      </table>
      </center>
      </form>

<br><br><br><br>
  <br><br><br>
  <br><br><br>
  <br><br><br>
 
  
<%@include file="Footer.jsp" %>