<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">
		<c:out value="Hello" />
		<!-- param имя переменной из которой можно получить параметры запроса -->
		<c:out value="${param.name}" default="Anonymous" />

		<c:url value="/index.jsp" var="inputURL" />
	</h1>
	<p align="center"><a href="${inputURL}">Ссылка на главную</a></p>
</body>
</html>