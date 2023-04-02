<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
	<jsp:useBean id="date" class="java.util.Date" scope="page" />
	<div class="container">
		<div class="alert alert-success" role="alert">
			<h4 class="alert-heading">Местное текущее время:</h4>
			<fmt:formatDate value="${date}" pattern="d MMMM, yyyy, H:mm:ss" />
		</div>
		<div class="alert alert-warning" role="alert">
			<h4 class="alert-heading">В Минске:</h4>
			<fmt:timeZone value="Europe/Minsk">
				<fmt:formatDate value="${date}" pattern="yyyy.MMM.dd hh:mm:ss" />
			</fmt:timeZone>
		</div>
		<div class="alert alert-info" role="alert">
			<h4 class="alert-heading">В Антарктиде:</h4>
			<fmt:timeZone value="Antarctica/Casey">
				<fmt:formatDate value="${date}" pattern="dd.MM.yyyy hh:mm:ss" />
			</fmt:timeZone>
		</div>
		<div align="center" class="alert alert-info">Добавьте вывод времени в Нью-Йорке</div>
		<p align="center">
			<c:url value="/index.jsp" var="inputURL" />
			<a href="${inputURL}">Ссылка на главную</a>
		</p>
	</div>
</body>
</html>