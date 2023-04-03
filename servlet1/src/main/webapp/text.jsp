<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="font-family: sans-serif;">
<h1>Count max!</h1>
<a href="calculator">Next task: calculator</a>
<form action="text" method="post">
    <div>
        <label for="text">Enter text:</label>
    </div>
    <div>
        <textarea id="text" name="text" rows="20" cols="100"></textarea>
    </div>
    <input type="submit" value="Find out" style="padding: 10px; width: fit-content;" />
</form>

<c:if test="${not empty vowels && not empty vowelsCount}">
    <h2>Vowels count: ${vowelsCount}</h2>
    <p><c:forEach items="${vowels}" var="vowel"><span style="margin: 2px">${vowel}</span></c:forEach> </p>
</c:if>
<c:if test="${not empty consonants && not empty consonantsCount}">
    <h2>Consonants count: ${consonantsCount}</h2>
    <p><c:forEach items="${consonants}" var="consonant"><span style="margin: 2px">${consonant}</span></c:forEach> </p>
</c:if>
<c:if test="${not empty punctuations && not empty punctuationsCount}">
    <h2>Punctuation count: ${punctuationsCount}</h2>
    <p><c:forEach items="${punctuations}" var="punctuation"><span style="margin: 2px">${punctuation}</span></c:forEach> </p>
</c:if>
</body>
</html>
