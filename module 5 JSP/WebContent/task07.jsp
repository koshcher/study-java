<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Выражения</title>
</head>
<body>
	<center>
		<table border=5 bgcolor="#EF8429">
			<tr>
				<th class="TITLE">Использование JavaServer Pages
		</table>
	</center>
	<p>Некое динамическое содержание созданное с использованием
		различных механизмов JSP:
	<ul>
		<li><b>Выражение.</B><BR> Имя вашего хоста: <%=request.getRemoteHost()%>.

			Scriptlet.
		<li><b></b><br> <%
 	out.println("Дополнительные данные запроса: " + request.getQueryString());
 %>
		<li><b>Объявление (совместно с выражением).<br> <%!private int accessCount = 0;%>
				Количество обращений к странице с момента загрузки сервера: <%=++accessCount%>
				Директива (совместно с выражением).
		</b>
		<li><br> <%@ page import="java.util.*"%>
			Текущая дата: <%=new Date()%>
	</ul>
</body>
</html>