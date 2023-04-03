<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="font-family: sans-serif;">
    <h1>Calculator!</h1>

    <form action="calculator" method="post">
        <div>
            <label for="expression">Enter expression like: 1+13*(45-6)^2+78/2</label>
        </div>
        <div>
            <input id="expression" name="expression" style="width: 100%;"></input>
        </div>
        <input type="submit" value="Find out" style="padding: 10px; width: fit-content;" />
    </form>

    <c:if test="${not empty result}">
        <h2>Result: ${result}</h2>
    </c:if>
</body>
</html>
