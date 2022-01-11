<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DNS Resolver</title>
</head>
<body>
	<h1>DNS Resolver</h1>
	<form action="/DNSResolverWEB/ResolveServlet" method="post">
		Enter address <input type="text" name="address"> <input
			type="submit" value="Resolve">
	</form>
	<br>
	<c:if test="${!empty message}">
		${message}
	</c:if>
</body>
</html>