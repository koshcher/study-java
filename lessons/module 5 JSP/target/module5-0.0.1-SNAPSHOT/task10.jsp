<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page errorPage="errorPage.jsp" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Error page</title>
</head>
<body>
    <body>
        <h1>Пример атрибута errorPage</h1>
        Результат деления на нуль : <% int x = 5/0;%>
    </body>
</body>
</html>