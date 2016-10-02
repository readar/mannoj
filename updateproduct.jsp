<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
body {
background-color:white;
}
</style>
</head>
<body>

<center> <h1 style="color:white"> SUNGLASS HUT</h1></center><hr>


<nav class="navbar navbar-default">
<div class="container-fluid">
<div class="navbar-header">
<a class="navbar-brand" href="#">Glass HutT</a>
</div>
<ul class="nav navbar-nav">
<li class="item active"> <a =href="#"> HOME</a></li>

</ul>
</div>
</nav>
<div align="center">
<%-- <form:form action="updateproduct" method="post" commandName="product" modelAttribute="product" enctype="multipart/form-data"> --%>
        <form:form action="${pageContext.request.contextPath}/admin/product/edit"
                   method="post" commandName="product" enctype="multipart/form-data">

         <form:hidden path="productid" value="${product.ptid}" />
<table border="0">
<tr><td>
<center><td colspan="0" align="center"><h2>Manage Product</h2></td></center>
</td></tr>
            <tr><td>
<h3 style="font-weight:bold">Product Name</h3></td><td>
<from:input path="ptname" /></td></tr>
<tr><td>
<h3 style="font-weight:bold">Product Description</h3></td><td>
<from:input path="ptdescription" /></td></tr>
<tr><td>
<h3 style="font-weight:bold">Product Author</h3></td><td>
<from:input path="ptauthor"  /></td></tr><tr><td><br>

<tr><td><h3 style="font-weight:bold">Product Price</h3></td><td>
<from:input path="ptprice" /></td></tr><br>
<tr><br>
<td><h3 style="font-weight:bold">Product Quantity</h3></td>
<td><form:input path="ptquantity" /></td></tr> 
             
               
   
                 </table>
                 
                <tr><td>
                <a href="submit" class="btn btn-info" role="button">Update Product</a>
                
             <h5 colspan="0" align="center" ><input type="reset" value="Cancel"></h5>
           
          </td></tr>
         
       
  
       
</div>

  </form:form>
<br><br>
<%@include file="angularjs.jsp" %>


