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

	<jsp:useBean id="news" class="dev.rk.servlet1.beans.Models" scope = "request"/>

	<h1>News</h1>

	<c:forEach var="newsItem" items="${news.list}">
		<h3>${newsItem.name}</h3>
		<img src="${newsItem.img}" style="max-width: 500px"/>
		<p>${newsItem.content.substring(0, 50)}</p>
		<a href="model.jsp?id=${newsItem.id}">Read more</a>
		<hr/>
	</c:forEach>

</body>
</html>