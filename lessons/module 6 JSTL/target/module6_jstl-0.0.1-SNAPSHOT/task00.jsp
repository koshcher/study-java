<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Создание переменной в которой хранится ссылка с параметрами -->
	<c:url value="/task00.jsp" var="mainUrl">
		<c:param name="first" value="123" />
		<c:param name="second" value="abc" />
	</c:url>

	<div class="container">
		<!-- использование переменной -->
		<p align="center">
			<a href="${mainUrl}">Ссылка c параметрами</a>
		</p>

		<c:url value="/index.jsp" var="inputURL" />
		<p align="center">
			<a href="${inputURL}">Ссылка на главную</a>
		</p>
	</div>
</body>
</html>