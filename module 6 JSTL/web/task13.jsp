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
	<div>
		<jsp:useBean id="date" class="java.util.Date" />
		<fmt:formatNumber value="12" pattern="###.##" />
		<!-- выдаст 12 -->
		<fmt:formatNumber value="12.00" pattern="###.##" />
		<!-- выдаст 12 -->
		<fmt:formatNumber value="12.011" pattern="###.##" />
		<!-- выдаст 12.01 -->
		<fmt:formatNumber value="12.0066" pattern="###.##" />
		<!-- выдаст 12.01 -->
		<fmt:formatNumber value="12.999" pattern="###.##" />
		<!-- выдаст 13 -->
		<fmt:formatNumber value="12.1" pattern="###.00" />
		<!-- выдаст 12.10 -->

		<fmt:formatNumber value="12" maxFractionDigits="5"	minFractionDigits="2" />
		<!-- выдаст 12.00 -->
		<fmt:formatNumber value="12.123456789" maxFractionDigits="5" minFractionDigits="2" />
		<!-- выдаст 12.12345 -->

		<c:url value="/index.jsp" var="inputURL" />
		<a href="${inputURL}">Ссылка на главную</a>
	</div>
</body>
</html>