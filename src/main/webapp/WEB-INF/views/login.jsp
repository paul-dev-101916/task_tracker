<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
</head>
<body>
	<center>
		<h2>Login</h2>
		<form method="POST" action="${contextPath}/login.do">
		<h2>${pageContext.request.contextPath}</h2>
		<h2>${contextPath}</h2>
			<h3>Enter user name:</h3>
			<br /> <input type="text" name="user_name"> <input
				type="submit" value="Submit">

		</form>
	</center>
</body>
</html>
