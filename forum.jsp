<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@include file="header.jsp" %>  
<div class="row">
  <div class="col-sm-12 col-md-12 col-lg-12">
    <div class="panel panel-default">
      <div class="panel-body">
        <div class="row">
        <form:form method="POST" commandName="forum" action="fpost">
<table>


<tr>
        <td>Category :</td>
        <td>
            <form:select path="ForumCategory">
            <form:option value="Java" />
            <form:option value="Oracle" />
            <form:option value="Spring" />
            <form:option value="Hibernate" />
            </form:select>
        </td>
    </tr>
    <tr>
    <td>Post Title :</td></tr>
    <tr><td>
    <form:input path="ForumTitle" /></td>
    </tr>
     <tr>
        <td>Post Content :</td></tr>
        <tr><td><form:textarea path="ForumContent" rows="1" cols="150" /></td>
    </tr>
       <tr>
        <td colspan="2"><input type="submit" value="Post"></td>
    </tr>
    </table>
    </form:form>
<%@include file="forumangular.jsp" %>
    
<%@include file="footer.jsp" %>
