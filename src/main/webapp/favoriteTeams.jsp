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
        <form method="post" action="FavoriteTeams">
            <div class="row">NBA
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="bostonCeltics" id="celtics" name="teams">
                        <label class="form-check-label" for="celtics">
                            Boston Celtics
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="brooklynNets" id="nets" name="teams">
                        <label class="form-check-label" for="nets">
                            Brooklyn Nets
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="newYorkKnicks" id="knicks" name="teams">
                        <label class="form-check-label" for="knicks">
                            New York Knicks
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="philadelphiaSixers" id="seventySixers" name="teams">
                        <label class="form-check-label" for="seventySixers">
                            Philadelphia 76ers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="torontoRaptors" id="raptors" name="teams">
                        <label class="form-check-label" for="raptors">
                            Toronto Raptors
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="chicagoBulls" id="bulls" name="teams">
                        <label class="form-check-label" for="bulls">
                            Chicago Bulls
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="clevelandCavaliers" id="cavaliers" name="teams">
                        <label class="form-check-label" for="cavaliers">
                            Cleveland Cavaliers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="detroitPistons" id="pistons" name="teams">
                        <label class="form-check-label" for="pistons">
                            Detroit Pistons
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="indianaPacers" id="pacers" name="teams">
                        <label class="form-check-label" for="pacers">
                            Indiana Pacers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="milwaukeeBucks" id="bucks" name="teams">
                        <label class="form-check-label" for="bucks">
                            Milwaukee Bucks
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="atlantaHawks" id="hawks" name="teams">
                        <label class="form-check-label" for="hawks">
                            Atlanta Hawks
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="charlotteHornets" id="hornets" name="teams">
                        <label class="form-check-label" for="hornets">
                            Charlotte Hornets
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="miamiHeat" id="heat" name="teams">
                        <label class="form-check-label" for="heat">
                            Miami Heat
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="orlandoMagic" id="magic" name="teams">
                        <label class="form-check-label" for="magic">
                            Orlando Magic
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="washingtonWizards" id="wizards" name="teams">
                        <label class="form-check-label" for="wizards">
                            Washington Wizards
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="denverNuggets" id="nuggets" name="teams">
                        <label class="form-check-label" for="nuggets">
                            Denver Nuggets
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="minnesotaTimberwolves" id="timberwolves" name="teams">
                        <label class="form-check-label" for="timberwolves">
                            Minnesota Timberwolves
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="oklahomaCityThunder" id="thunder" name="teams">
                        <label class="form-check-label" for="thunder">
                            Oklahoma City Thunder
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="portlandTrailBlazers" id="blazers" name="teams">
                        <label class="form-check-label" for="blazers">
                            Portland Trail Blazers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="utahJazz" id="jazz" name="teams">
                        <label class="form-check-label" for="jazz">
                            Utah Jazz
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="goldenStateWarriors" id="warriors" name="teams">
                        <label class="form-check-label" for="warriors">
                            Golden State Warriors
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="losAngelesClippers" id="clippers" name="teams">
                        <label class="form-check-label" for="clippers">
                            LA Clippers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="losAngelesLakers" id="lakers" name="teams">
                        <label class="form-check-label" for="lakers">
                            LA Lakers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="phoenixSuns" id="suns" name="teams">
                        <label class="form-check-label" for="suns">
                            Phoenix Suns
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="sacramentoKings" id="kings" name="teams">
                        <label class="form-check-label" for="kings">
                            Sacramento Kings
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="dallasMavericks" id="mavericks" name="teams">
                        <label class="form-check-label" for="mavericks">
                            Dallas Mavericks
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="houstonRockets" id="rockets" name="teams">
                        <label class="form-check-label" for="rockets">
                            Houston Rockets
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="memphisGrizzlies" id="grizzlies" name="teams">
                        <label class="form-check-label" for="grizzlies">
                            Memphis Grizzlies
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="newOrleansPelicans" id="pelicans" name="teams">
                        <label class="form-check-label" for="pelicans">
                            New Orleans Pelicans
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="sanAntonioSpurs" id="spurs" name="teams">
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
