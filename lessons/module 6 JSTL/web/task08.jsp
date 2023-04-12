<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="nameBean" class="ua.step.beans.NameBean" />

	<c:set var="names" value="${nameBean.names}" />

	<h2 align="center">Цикл с шагом 2</h2>

	<c:forEach items="${names}" var="name" step="2">
		<h2 align="center">
			<c:out value="${name}" />
		</h2>
	</c:forEach>

	<p align="center">
		<c:url value="/index.jsp" var="inputURL" />
		<a href="${inputURL}">Ссылка на главную</a>
	</p>
</body>
</html>