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

<title>Логические операторы</title>
</head>
<body>
	<div class="container">
		<form>
			<input type="number" name="age" /> <input type="submit"
				value="Отправить" />
		</form>

		<h3 align="center">
			<c:choose>
				<c:when test="${param.age le 0}">
                     Вы еще не родились
                </c:when>
				<c:when test="${param.age lt 10}">
                    Ребенок
                </c:when>
				<c:when test="${param.age lt 16}">
                   Подросток
                </c:when>
				<c:when test="${param.age lt 50}">
                  Взрослый
                 </c:when>
				<c:when test="${param.age lt 120}">
                      Пожилой
                 </c:when>
				<c:otherwise>
                     Ну здравствуй Дункан.
                </c:otherwise>
			</c:choose>
		</h3>
		<c:url value="/index.jsp" var="inputURL" />
		<p align="center">
			<a href="${inputURL}">Ссылка на главную</a>
		</p>
	</div>
</body>
</html>