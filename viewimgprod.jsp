<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>More Details</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script>document.write('<base href="' + document.location + '" />');</script>
<link href="./resources/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="./resources/css/style.css" rel="stylesheet" media="screen">
<script data-require="angular.js@1.0.x" src="http://code.angularjs.org/1.0.7/angular.min.js" data-semver="1.0.7"></script>
</head>
<body>
<br><br><br>
<table class="table table-striped">
<tr>

<th>Product Name</th>
<th>Product Description</th>
<th>Product Price</th>
<th>Product Quantity</th>
<th>Product Image</th>
</tr>
<tr>

<td>${product.ptname}</td>
<td>${product.ptdescription}</td>
<td>${product.ptprice}</td>
<td>${product.ptquantity}</td>
<td><img src="resources/images/${product.ptname}.jpg" style=height:200px;width:200px;"/></td>
<td><a href="addtoCart/${userid}/${ptid}">Want to buy this,Then add to your cart</a>
</tr>

</table>

</body>
</html>