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
    <div class="container-fluid">
        <h2>Nba Games tonight </h2>
        <table class="table table-striped">
            <thead class="thead-light">
            <th>Home Team</th>
            <th>Away Team</th>
            <th>Start Time</th>
            </thead>
            <tbody>
            <c:forEach var="x" items="${nbaGameDetails}">
                <tr>
                    <td>${x.homeTeam}</td>
                    <td>${x.awayTeam}</td>
                    <td>${x.commenceTime}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>
