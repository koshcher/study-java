<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<title>fn:containsIgnoreCase() example</title>
</head>
<body>
	<div class="container" align="center">
		<h3>Страница проверяет, содержится ли одна строка в другой</h3>
		<form method="post">
			<div class="form-group row">
				<label for="string1" class="col-sm-2 col-form-label">string1</label>
				<div class="col-sm-10">
					<input class="form-control" id="string1" type="text"
						name="string1">
				</div>
			</div>
			<div class="form-group row">
				<label for="string2" class="col-sm-2 col-form-label">string2</label>
				<div class="col-sm-10">
					<input class="form-control" id="string2" type="text"
						name="string2">
				</div>
			</div>
			<input type="submit">
		</form>

		<c:if test="${pageContext.request.method=='POST'}">
			<c:if test="${fn:containsIgnoreCase(param.string1, param.string2)}">
				<div class="alert alert-success" role="alert">
					<c:out value="string1 содержит string2" />
				</div>
			</c:if>

			<c:if test="${fn:containsIgnoreCase(param.string2, param.string1)}">
				<div class="alert alert-success" role="alert">
					<c:out value="string2 содержит string1" />
				</div>
			</c:if>
		</c:if>
	</div>

	<div align="center">
		<c:url value="/index.jsp" var="inputURL" />
		<a href="${inputURL}">Ссылка на главную</a>
	</div>
</body>
</html>