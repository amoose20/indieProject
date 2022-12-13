<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html><body>

<div class="container-fluid">
    <h2>Search Results: </h2>
    <table class="table table-striped">
        <thead class="thead-light">
        <th>User</th>
        </thead>
        <tbody>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.name}</td>
                <td>
                <c:forEach var="team" items="${user.teams}">
                    ${team.name}<br/>
                </c:forEach>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

</body>
</html>
