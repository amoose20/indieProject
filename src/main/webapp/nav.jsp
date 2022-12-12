<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 12/9/22
  Time: 4:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="head.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <ul class="nav nav-pills">
        <li class="nav-item">
            <a class="nav-link active" href="#">Home</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="favoriteTeams.jsp">Favorite Teams</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="odds">Odds</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="searchUsers.jsp">Search Users</a>
        </li>
        <li class="nav-item">
            <c:choose>
                <c:when test="${empty userName}">
                    <a class="nav-link" href = "logIn">Log in</a>
                </c:when>
            </c:choose>
        </li>
    </ul>
<body>

</body>
</html>
