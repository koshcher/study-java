<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<title>JSTL XML Tag</title>
<body>
	<div class="container">
		<h3>Информация о книге:</h3>
		<c:import var="bookInfo"
			url="http://localhost:8080/module6_jstl/books.xml" />

		<x:parse xml="${bookInfo}" var="output" />
		<b>Автор</b>:
		<x:out select="$output/books/book[1]/name" />
		<br> <b>Цена</b>:
		<x:out select="$output/books/book[1]/price" />
	</div>
</body>
</html>