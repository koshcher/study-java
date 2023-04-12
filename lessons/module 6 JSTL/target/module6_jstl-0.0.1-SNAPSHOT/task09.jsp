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
	<h1 align="center">
		<!-- передача параметра в импортируюмую страницу -->
		<c:import url="part.jsp" charEncoding="utf-8">
			<c:param name="awl" value="шило" />
		</c:import>
		<c:out value="на " />
		
		<!-- получение значения параметра из импортируемой страницы -->
		<c:out value="${soap}" />
	</h1>

    <p align="center">
        <c:url value="/index.jsp" var="inputURL" />
        <a href="${inputURL}">Ссылка на главную</a>
    </p>
</body>
</html>