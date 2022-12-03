<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 12/3/22
  Time: 12:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>

<html>
<head>
    <title>Favorite Teams</title>
</head>
<body>
    <h1>Select your favorite teams</h1>
    <div class="container">
        <div class="row">
            <form method="post" action="FavoriteTeams">
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="bostonCeltics" id="celtics">
                        <label class="form-check-label" for="nets">
                            Boston Celtics
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="brooklynNets" id="nets">
                        <label class="form-check-label" for="nets">
                            Brooklyn Nets
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="newYorkKnicks" id="knicks">
                        <label class="form-check-label" for="knicks">
                            New York Knicks
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="philadelphiaSixers" id="seventySixers">
                        <label class="form-check-label" for="seventySixers">
                            Philadelphia 76ers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="torontoRaptors" id="raptors">
                        <label class="form-check-label" for="raptors">
                            Toronto Raptors
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="chicagoBulls" id="bulls">
                        <label class="form-check-label" for="bulls">
                            Chicago Bulls
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="clevelandCavaliers" id="cavaliers">
                        <label class="form-check-label" for="cavaliers">
                            Cleveland Cavaliers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="detroitPistons" id="pistons">
                        <label class="form-check-label" for="pistons">
                            Detroit Pistons
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="indianaPacers" id="pacers">
                        <label class="form-check-label" for="pacers">
                            Indiana Pacers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="milwaukeeBucks" id="bucks">
                        <label class="form-check-label" for="bucks">
                            Milwaukee Bucks
                        </label>
                    </div>
                </div>
                <input type="submit" value="save favorite teams"/>
            </form>
        </div>
    </div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>
