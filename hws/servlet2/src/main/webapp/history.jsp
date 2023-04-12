<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-family: sans-serif;">
	<nav style="display: flex; justify-content: center; gap: 10px;">
		<a href="index.jsp">General information</a>
		<a href="history.jsp">History</a>
		<a href="news.jsp">News</a>
		<a href="models.jsp">Laptop models</a>
	</nav>

	<jsp:useBean id="history" class="dev.rk.servlet1.beans.History" scope = "application"/>

	<h1>History</h1>
	<a href="${history.link}">Wikipedia page</a>
	<img src="${history.img}" style="max-width: 500px"/>
	<p>${history.text}</p>

</body>
</html>