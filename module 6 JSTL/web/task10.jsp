<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
    content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<title>JSTL c:catch Core Tag Example</title>
</head>
<body>
	<%!int num1 = 10;
	int num2 = 0;%>

	<c:catch var="errormsg">
		<%
			int res = num1 / num2;
				out.println(res);
		%>
	</c:catch>
	<c:if test="${errormsg != null}">
		<h1 align="center">
			<font color="red">Возникло исключение при арифметической
				операции. Исправьте ошибку. Текст исключения: ${errormsg}</font>
		</h1>
	</c:if>

	<p align="center">
		<c:url value="/index.jsp" var="inputURL" />
		<a href="${inputURL}">Ссылка на главную</a>
	</p>
</body>
</html>