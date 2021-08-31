<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
	color:red;
}
</style>
</head>
<body>

	<h2>User Form</h2>
	
	<form:form action="saveForm" modelAttribute="user" method="post">
	<table>
		<tr>
			<td>UserName</td>
			<td><form:input path="uname"/></td>
			<td><form:errors path="uname" class="error"/>
		</tr>
		<tr>
			<td>Password</td>
			<td><form:password path="pwd"/></td>
			<td><form:errors path="pwd" class="error"/>
		</tr>
		<tr>
			<td>Email</td>
			<td><form:input path="email"/></td>
			<td><form:errors path="email" class="error"/>
		</tr>
		<tr>
			<td>Phno</td>
			<td><form:input path="phno"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="Register" /></td>
		</tr>
	</table>
	
	</form:form>

</body>
</html>