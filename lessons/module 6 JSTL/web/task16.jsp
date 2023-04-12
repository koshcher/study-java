<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<title>JSTL sql:query Tag</title>
<body>
	<!-- подготовка соеденения с базой данных  -->
	<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost/test?serverTimezone=UTC" user="admin" password="adminadmin" />

	<!-- выполнение запроса  -->
	<sql:query dataSource="${snapshot}" var="result">
      SELECT * from Employees;
    </sql:query>

	<div class="container">
		<table class="table table-striped">
			<thead class="thead-dark">
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Фамилия</th>
					<th scope="col">Имя</th>
					<th scope="col">Зарплата</th>
				</tr>
			</thead>
			<c:forEach var="row" items="${result.rows}">
				<tr>
					<th scope="row"><c:out value="${row.id}" />
					<td><c:out value="${row.first}" />
					<td><c:out value="${row.last}" />
					<td><c:out value="${row.salary/100}" />
				</tr>
			</c:forEach>
		</table>
	</div>
	<div align="center">
		<c:url value="/index.jsp" var="inputURL" />
		<a href="${inputURL}">Ссылка на главную</a>
	</div>
</body>
</html>