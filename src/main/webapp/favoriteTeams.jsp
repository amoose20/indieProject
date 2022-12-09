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
        <form name="favoriteTeamsForm" method="post" action="favoriteTeams">
            <div class="row">NBA
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Boston Celtics" id="celtics" name="teams">
                        <label class="form-check-label" for="celtics">
                            Boston Celtics
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Brooklyn Nets" id="nets" name="teams">
                        <label class="form-check-label" for="nets">
                            Brooklyn Nets
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="New York Knicks" id="knicks" name="teams">
                        <label class="form-check-label" for="knicks">
                            New York Knicks
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Philadelphia Seventy Sixers" id="seventySixers" name="teams">
                        <label class="form-check-label" for="seventySixers">
                            Philadelphia 76ers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Toronto Raptors" id="raptors" name="teams">
                        <label class="form-check-label" for="raptors">
                            Toronto Raptors
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Chicago Bulls" id="bulls" name="teams">
                        <label class="form-check-label" for="bulls">
                            Chicago Bulls
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Cleveland Cavaliers" id="cavaliers" name="teams">
                        <label class="form-check-label" for="cavaliers">
                            Cleveland Cavaliers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Detroit Pistons" id="pistons" name="teams">
                        <label class="form-check-label" for="pistons">
                            Detroit Pistons
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Indiana Pacers" id="pacers" name="teams">
                        <label class="form-check-label" for="pacers">
                            Indiana Pacers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Milwaukee Bucks" id="bucks" name="teams">
                        <label class="form-check-label" for="bucks">
                            Milwaukee Bucks
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Atlanta Hawks" id="hawks" name="teams">
                        <label class="form-check-label" for="hawks">
                            Atlanta Hawks
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Charlotte Hornets" id="hornets" name="teams">
                        <label class="form-check-label" for="hornets">
                            Charlotte Hornets
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Miami Heat" id="heat" name="teams">
                        <label class="form-check-label" for="heat">
                            Miami Heat
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Orlando Magic" id="magic" name="teams">
                        <label class="form-check-label" for="magic">
                            Orlando Magic
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Washington Wizards" id="wizards" name="teams">
                        <label class="form-check-label" for="wizards">
                            Washington Wizards
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Denver Nuggets" id="nuggets" name="teams">
                        <label class="form-check-label" for="nuggets">
                            Denver Nuggets
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Minnesota Timberwolves" id="timberwolves" name="teams">
                        <label class="form-check-label" for="timberwolves">
                            Minnesota Timberwolves
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Oklahoma City Thunder" id="thunder" name="teams">
                        <label class="form-check-label" for="thunder">
                            Oklahoma City Thunder
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Portland TrailBlazers" id="blazers" name="teams">
                        <label class="form-check-label" for="blazers">
                            Portland Trail Blazers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Utah Jazz" id="jazz" name="teams">
                        <label class="form-check-label" for="jazz">
                            Utah Jazz
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Golden State Warriors" id="warriors" name="teams">
                        <label class="form-check-label" for="warriors">
                            Golden State Warriors
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Los Angeles Clippers" id="clippers" name="teams">
                        <label class="form-check-label" for="clippers">
                            LA Clippers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Los Angeles Lakers" id="lakers" name="teams">
                        <label class="form-check-label" for="lakers">
                            LA Lakers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Phoenix Suns" id="suns" name="teams">
                        <label class="form-check-label" for="suns">
                            Phoenix Suns
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Sacramento Kings" id="kings" name="teams">
                        <label class="form-check-label" for="kings">
                            Sacramento Kings
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Dallas Mavericks" id="mavericks" name="teams">
                        <label class="form-check-label" for="mavericks">
                            Dallas Mavericks
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Houston Rockets" id="rockets" name="teams">
                        <label class="form-check-label" for="rockets">
                            Houston Rockets
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Memphis Grizzlies" id="grizzlies" name="teams">
                        <label class="form-check-label" for="grizzlies">
                            Memphis Grizzlies
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="New Orleans Pelicans" id="pelicans" name="teams">
                        <label class="form-check-label" for="pelicans">
                            New Orleans Pelicans
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="San Antonio Spurs" id="spurs" name="teams">
                        <label class="form-check-label" for="spurs">
                            San Antonio Spurs
                        </label>
                    </div>
                </div>
            </div>
        <input type="submit" value="save favorite teams"/>
        </form>
    </div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>
