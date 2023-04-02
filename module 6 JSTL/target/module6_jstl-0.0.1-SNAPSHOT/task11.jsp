<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<div class="container">
		<!-- проверка типа запроса -->
		<c:if test="${pageContext.request.method=='POST'}">
			<jsp:useBean id="employee" class="ua.step.beans.Employee">
				<jsp:setProperty name="employee" property="lastName"
					value="${param.lastName}" />
				<jsp:setProperty name="employee" property="firstName"
					value="${param.firstName}" />
			</jsp:useBean>
			<c:catch var="errormsg">
				<jsp:setProperty name="employee" property="salary"
					value="${param.salary}" />
			</c:catch>
            ${controller.addEmployee(employee)}
            <div class="alert alert-success" role="alert">Это
				уведомление об успехе — check it out!</div>
		</c:if>
		<div class="alert alert-success" role="alert">Для оформления
			данной страницы используется bootstrap 4.3.1</div>
		<div class="row">
			<div class="col-2">
				<form method="post">
					<div class="form-group">
						<label for="text">Фамилия</label><input type="text"
							name="lastName" class="form-control">
					</div>
					<div class="form-group">
						<label for="text">Имя</label><input type="text" name="firstName"
							class="form-control">
					</div>
					<div class="form-group">
						<label for="text">Зарплата</label><input type="number"
							name="salary" class="form-control">
					</div>
					<input class="btn btn-primary" type="submit" value="Добавить">
				</form>
			</div>
			<jsp:useBean id="controller" class="ua.step.beans.EmployeeController"
				scope="session" />

			<div class="col">
				<table border="1" class="table table-striped">
					<thead>
						<tr>
							<th>Фамилия</th>
							<th>Имя</th>
							<th>Зарплата</th>
						</tr>
					</thead>
					<c:forEach items="${controller.employes}" var="employee">
						<tr>
							<td valign="top"><c:out value="${employee.firstName}" /></td>
							<td valign="top"><c:out value="${employee.lastName}" /></td>
							<td class="${employee.salary gt 1000 ? 'alert alert-danger' : '' }" valign="top"><c:out
									value="${employee.salary}" /></td>
						</tr>
					</c:forEach>
					<tr>
						<td>ИТОГО</td>
						<td class="text-right" colspan="2"></td>
					</tr>
				</table>
			</div>
		</div>
	</div>
	<div align="center" class="alert alert-info">Измени пример, чтобы
		выводилась ИТОГО по зароботной плате</div>
	<p align="center">
		<c:url value="/index.jsp" var="inputURL" />
		<a href="${inputURL}">Ссылка на главную</a>
	</p>
</body>
</html>