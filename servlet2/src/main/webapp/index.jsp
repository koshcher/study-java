<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servlet 1 hw</title>
</head>
<body  style="font-family: sans-serif;">

	<nav style="display: flex; justify-content: center; gap: 10px;">
		<a href="index.jsp">General information</a>
		<a href="history.jsp">History</a>
		<a href="news.jsp">News</a>
		<a href="models.jsp">Laptop models</a>
	</nav>

	<jsp:useBean id="info" class="dev.rk.servlet1.beans.ManufacturerInfo" scope = "application"/>

	<h1>${info.name}</h1>
	<p>Country: ${info.country}</p>
	<img style="width: 200px;" src="${info.logoUrl}"/>
	<p>Employees count: ${info.employeesCount}</p>
	<p>Description: ${info.description}</p>
</body>
</html>