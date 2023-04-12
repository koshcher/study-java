<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="dev.rk.servlet1.beans.Item" %><%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 4/10/2023
  Time: 9:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <nav style="display: flex; justify-content: center; gap: 10px;">
    <a href="index.jsp">General information</a>
    <a href="history.jsp">History</a>
    <a href="news.jsp">News</a>
    <a href="models.jsp">Laptop models</a>
  </nav>

  <jsp:useBean id="models" class="dev.rk.servlet1.beans.Models" scope = "application"/>

  <c:set var="item" value='${models.getOne(param["id"]).get()}'/>

  <h1>${item.name}</h1>
  <img src="${item.img}" style="max-width: 500px"/>
  <c:forEach var="img" items="${item.moreImgs}">
    <img src="${img}" style="max-width: 500px"/>
  </c:forEach>
  <p>${item.content}</p>

</body>
</html>
