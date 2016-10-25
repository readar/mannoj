<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<style>
div.ex {
	text-align: right width:300px;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
}
</style>
<body>
	
<h1>Registration</h1>
<p>ALREADY REGISTERED? <a href="login">SIGN IN</a></p>
<a href="${flowExecutionUrl}&_eventId_home">Home</a>

	<div class="ex">
		<form:form commandName="usy">
			<table>
<tr><td>
FirstName</td><td><form:input type="text" path="firstname" /></td></tr>
 <!-- to display validation messages -->
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('firstname')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach> 
				
				<tr><td>
MiddleName</td><td><form:input type="text" path="middlename" /></td></tr>
 <!-- to display validation messages -->
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('middlename')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach> 
				
<tr><td>
LastName</td><td><form:input type="text" path="lastname" /></td></tr>
 <!-- to display validation messages -->
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('lastname')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach> 

<tr><td>				
UserName</td><td><form:input type="text" path="username" /></td></tr>
 <!-- to display validation messages -->
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('username')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach> 
				

<%-- <tr><td>
Enter User Id</td><td><form:input type="text" path="id"  /></td></tr>
<!-- to display validation messages -->
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('id')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>  --%>
<tr><td>
Enter Password</td><td><form:input type="password" path="password"  /></td></tr>
<!-- to display validation messages -->
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('password')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach> 

<tr><td>
Enter Confirmed Password</td><td><form:input type="password" path="confirmpassword"  /></td></tr>
<!-- to display validation messages -->
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('confirmpassword')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach> 
				<tr><td>
Email Id</td><td><form:input type="email" path="email" /></td></tr>
<!-- to display validation messages -->
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('email')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach> 

				

<%-- <tr><td>
Phone no.</td><td><form:input type="text" path="contact" /></td></tr>
<!-- to display validation messages -->
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('contact')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach> 


<tr><td>
City</td><td> <form:input type="text" path="address" /></td></tr>

<!-- to display validation messages -->
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('address')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>  --%>

<tr><td>
<input type="CHECKBOX" NAME="OFFER" CHECKED>I agree to receive information about exciting offers
</td></tr>
</table>

<br /><br />

<div class="center">
<input type="submit" name="_eventId_submit" value="submit" ></div>

</form:form>

	</div>
</body>
</html>