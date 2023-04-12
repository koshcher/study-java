<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>О счастливчик.</title>
</head>
<body>
	<%
	   double num = Math.random();
		if (num > 0.50) {
	%>
	<h2>Вам сегодня повезло!</h2>
	<p>
		(<%=num%>)
	</p>
	<%
		} else {
	%>
	<h2>На этот раз не повезло, но игра продолжается ...</h2>
	<p>
		(<%=num%>)
	</p>
	<%
		}
	%>
	<h3><a href="<%=request.getRequestURI()%>">Попробуй еще</a></h3>
	<p>Ви виграли </p>
	<p>
		<a href="index.jsp">Вернутся на главную</a>
	</p>
</body>
</html>