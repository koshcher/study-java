<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form >
			<div class="form-group">
				<label class="form-control" for="exampleInputEmail1" >Введите
					возраст</label> <input class="form-control" id="exampleInputEmail1"
					type="number" name="age" value="${param.age}"/>
				<button type="submit" class="btn btn-primary">Отправить</button>
			</div>
		</form>

		<c:if test="${not empty param.age}">
			<c:if test="${param.age gt 18}">
				<div class="alert alert-warning" role="alert">Возраст более 18
					лет</div>
			</c:if>

			<c:if test="${param.age lt 60}">
				<div class="alert alert-success" role="alert">Возраст менее 60 лет</div>
			</c:if>
		</c:if>
		
		<ul>
			<li>eq – проверка на равенство</li>
			<li>ne – проверка на неравенство</li>
			<li>lt – строго менее чем</li>
			<li>gt – строго более чем</li>
			<li>le – меньше либо равно чему-то</li>
			<li>ge – больше или равно чему-то</li>
			<li>empty - проверка на null</li> 
			<li>not empty - проверка на неравенство null</li>
		</ul>
		
		<p>Тэг c:if не предпологает наличие else, таким образом можно
			сделать несколько вариантов поведения, нельзя сделать некоторое
			значение по-умолчанию.</p>

		<c:url value="/index.jsp" var="inputURL" />
		<a href="${inputURL}">Ссылка на главную</a>
	</div>
</body>
</html>