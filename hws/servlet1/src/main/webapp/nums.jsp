<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-family: sans-serif;">
	<h1>Count max, avg, min!</h1>
	<a href="text">Next task: text</a>
	<form action="nums" method="post" style="display: flex; gap: 10px; flex-direction: column; margin: auto; justify-content: center; align-items: center;">

		<div>
			<label for="num1">Enter 1 number:</label>
			<input type="number" id="num1" name="num1">
		</div>
		<div>
			<label for="num2">Enter 2 number:</label>
			<input type="number" id="num2" name="num2">
		</div>
		<div>
			<label for="num3">Enter 3 number:</label>
			<input type="number" id="num3" name="num3">
		</div>

		<div>
			<input type="radio" id="max" name="operation" value="max" checked>
			<label for="max">Max</label>
		</div>
		<div>
			<input type="radio" id="min" name="operation" value="min">
			<label for="min">Min</label>
		</div>
		<div>
			<input type="radio" id="avg" name="operation" value="avg">
			<label for="avg">Avg</label>
		</div>

	   <input type="submit" value="Find out" style="padding: 10px; width: fit-content;" />
	</form>

	<c:if test="${not empty max}">
		<h2>Max: ${max}</h2>
	</c:if>
	<c:if test="${not empty min}">
		<h2>Min: ${min}</h2>
	</c:if>
	<c:if test="${not empty avg}">
		<h2>Avg: ${avg}</h2>
	</c:if>
</body>
</html>