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
	<div class="content">
		<fieldset>
			<legend>Confirm Details</legend>
			<!-- for triggering webflow events using links,
					 the eventId to be triggered is given in "href" attribute as:
				 -->
			<a href="${flowExecutionUrl}&_eventId_home">Home</a><br /> <br />
			<form:form modelAttribute="usy">
			 	<form:label path="firstname">First Name :</form:label>${usy.firstname}
					<br />
				<br /> 
				<form:label path="middlename">Middle Name :</form:label>${usy.middlename}
					<br />
				<br /> 
				<form:label path="lastname">Last Name :</form:label>${usy.lastname}
					<br />
				<br /> 
				<form:label path="username">User Name:</form:label>${usy.username}
					<br />
				<br />
				<form:label path="password">Password :</form:label>${usy.password}
					<br />


				<form:label path="email">Email:</form:label>${usy.email}
					<br />
				<br />
		<%-- 		<form:label path="contact">Mobile:</form:label>${ud.contact}
					<br />
				<br />
				<form:label path="address">Address :</form:label>${ud.address}
					<br />
				<br /> --%>
				<input name="_eventId_edit" type="submit" value="Edit" />
				<input name="_eventId_submit" type="submit" value="Confirm Details" />
				<br />
			</form:form>
		</fieldset>
	


	</div>
</body>
</html>