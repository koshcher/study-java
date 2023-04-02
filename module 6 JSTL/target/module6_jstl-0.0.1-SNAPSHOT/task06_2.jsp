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
	<div class="container">
		<jsp:useBean id="nameBean" class="ua.step.beans.NameBean" />

		<c:set var="namesArray" value="${nameBean.namesAsArray}" />

		<c:forEach items="${namesArray}" var="name">
			<h3 align="center">
				<c:out value="${name}" />
			</h3>
		</c:forEach>

		<p align="center">
			<c:url value="/index.jsp" var="inputURL" />
			<a href="${inputURL}">Ссылка на главную</a>
		</p>
	</div>
</body>
</html>