<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>

<html>
<body>
    <form action="searchUser" class="form-inline">
        <div class="form-group">
            <label for="searchTerm">Search</label>
            <input type="text" class="form-control" id="searchTerm" name="searchTerm">
        </div>
        <button type="submit" name="submit" value="search" class="btn btn-primary">Search by last name</button>
        <button type="submit" name="submit" value="viewAll" class="btn btn-primary">View all</button>
    </form>
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
