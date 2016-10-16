<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>User Registration</title>
	</head>
	<body>
	 <div align="center">
	 <!-- modelAttribute="userDetails" enctype="multipart/form-data" -->
        <form:form action="signupdate" method="post" commandName="user" enctype="multipart/form-data" >
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>User Registration</h2></td>
                </tr>
                <tr>
                    <td>User Name:</td>
                    <td><form:input path="username" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><form:password path="password" /></td>
                </tr>
                                
                <tr>
                    <td>Confirm Password:</td>
                    <td><form:password path="ConfirmPassword" /></td>
                </tr>
                <tr>
                    <td>E-mail:</td>
                    <td><form:input path="email" /></td>
                </tr>
               	<tr>
                    <td>Address :</td>
                    <td><form:input path="address" /></td>
                </tr>       
      
             	<tr>
                    <td>Image Upload :</td>
                    <td><form:input type="file" path="file" /></td>
                </tr>       
       
       
       
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
            </table>
        </form:form>
    </div>
	</body>
</html>