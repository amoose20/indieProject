<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>

<html>
<body>
<c:choose>
    <c:when test="${empty userName}">
        <a href = "logIn">Log in</a>
    </c:when>
    <c:otherwise>
        <h3>Welcome ${userName}</h3>
    </c:otherwise>
</c:choose>
</body>
</html>
