<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Product Details</h2>
	<form:form action="saveProduct" modelAttribute="product" method="post">
		<table>
			<tr>
				<td>Product ID</td>
				<td><form:input path="productId" />
			</tr>
			<tr>
				<td>Product Name</td>
				<td><form:input path="productName" />
			</tr>
			<tr>
				<td>Product Price</td>
				<td><form:input path="productPrice" />
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="save" />
			</tr>

		</table>
	</form:form>
</body>
</html>