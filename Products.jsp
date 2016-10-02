<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="Header.jsp" %>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html lang="en">
    <head> 
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/bootstrap/js/jquery-1.9.1.mini.js"></script>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>


    <script type="text/javascript" src="resources/bootstrap/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
    

    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>
<style>
.itm{
width:70%;
margin: auto;
}
</style>

		<title>Manage Product</title>
	</head>
	<body>
	<div align="center">
	
        <form:form action="products" method="post" commandName="product" modelAttribute="product" enctype="multipart/form-data">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Manage Product</h2></td>
                </tr>
                
                
                <tr>
                    <td><form:label path="ptname">Product Name:</form:label></td>
                    <td><form:input path="ptname" /></td>
                </tr>
               
                <tr>
                    <td><form:label path="ptdescription">Product Description:</form:label></td>
                    <td><form:input path="ptdescription" /></td>
                </tr><br>
             	<tr>
                    <td><form:label path="ptprice">Product Price:</form:label></td>
                    <td><form:input path="ptprice" /></td>
                </tr>     
             	<tr>
                    <td><form:label path="ptquantity">Product Quantity:</form:label></td>
                    <td><form:input path="ptquantity" /></td>
                </tr>     
                <tr>
                    <td><form:label path="ptauthor">Product Author:</form:label></td>
                    <td><form:input path="ptauthor" /></td>
                </tr> 
                
                 
             	<tr>
                    <td><form:label path="img">Image Upload:</form:label></td>
                    <td><form:input type="file" path="img"  /></td>
                </tr>   
                   
             	<tr>
				<td><form:label path="supplier">
						<spring:message text="Supplier By:" />
					</form:label></td>
				<%-- <td><form:input path="supplier.name" required="true" /></td> --%>
				 <td><form:select path="supplier.spname" items="${supplierList}" itemValue="spname" itemLabel="spname" /></td>
			</tr>
			<tr>
				<td><form:label path="category">
						<spring:message text="Category belongs to:" />
					</form:label></td>
				<%-- <td><form:input path="category.tgname" required="true" /></td> --%>
				<td><form:select path="category.tgname" items="${categoryList}" itemValue="tgname" itemLabel="tgname" /></td>
			</tr>  
       
       
       
                    <td colspan="2" align="center" ><input type="submit" value="AddProduct" /></td>
                    
                </tr>
            </table>
        </form:form>
    </div>

   <%@include file="angularjs.jsp" %> 
  <br><br><br><br><br><br><br><br><br><br>
<%@include file="Footer.jsp" %>

