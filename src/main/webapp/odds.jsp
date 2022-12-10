<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 12/2/22
  Time: 9:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>

<html>
<head>
    <title>Odds</title>
</head>
<body>

  <div class="container-fluid">
    <h2>Upcoming NBA games</h2>
    <table class="table table-striped">
      <thead class="thead-light">
      <th>Start Time</th>
      <th>Team 1 (price)</th>
      <th>Team 2 (price)</th>
      </thead>
      <tbody>
      <c:forEach var="a" items="${nbaGameDetails}">
        <tr>
          <td>${a.commenceTime}</td>
          <td>${a.bookmakers[0].markets[0].outcomes[0].name} (${a.bookmakers[0].markets[0].outcomes[0].price})</td>
          <td>${a.bookmakers[0].markets[0].outcomes[1].name} (${a.bookmakers[0].markets[0].outcomes[1].price})</td>
        </tr>
      </c:forEach>
      </tbody>
    </table>
  </div>

  <<div class="container-fluid">
    <h2>Upcoming NFL Games</h2>
    <table class="table table-striped">
      <thead class="thead-light">
      <th>Start Time</th>
      <th>Team 1 (price)</th>
      <th>Team 2 (price)</th>
      </thead>
      <tbody>
      <c:forEach var="a" items="${nflGameDetails}">
        <tr>
          <td>${a.commenceTime}</td>
          <td>${a.bookmakers[0].markets[0].outcomes[0].name} (${a.bookmakers[0].markets[0].outcomes[0].price})</td>
          <td>${a.bookmakers[0].markets[0].outcomes[1].name} (${a.bookmakers[0].markets[0].outcomes[1].price})</td>
        </tr>
      </c:forEach>
      </tbody>
    </table>
  </div>

  <div class="container-fluid">
    <h2>Upcoming NHL games</h2>
    <table class="table table-striped">
      <thead class="thead-light">
      <th>Start Time</th>
      <th>Team 1 (price)</th>
      <th>Team 2 (price)</th>
      </thead>
      <tbody>
      <c:forEach var="a" items="${nhlGameDetails}">
        <tr>
          <td>${a.commenceTime}</td>
          <td>${a.bookmakers[0].markets[0].outcomes[0].name} (${a.bookmakers[0].markets[0].outcomes[0].price})</td>
          <td>${a.bookmakers[0].markets[0].outcomes[1].name} (${a.bookmakers[0].markets[0].outcomes[1].price})</td>
        </tr>
      </c:forEach>
      </tbody>
    </table>
  </div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>
