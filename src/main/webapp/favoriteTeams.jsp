<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 12/3/22
  Time: 12:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>
<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>
<%@include file="nav.jsp"%>



<html>
<head>
    <title>Favorite Teams</title>
</head>
<body>
    <h1>Select your favorite teams</h1>
    <div class="container">
        <form name="favoriteTeamsForm" method="post" action="favoriteTeams">
            <div class="row m-5">NBA
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
                            Los Angeles Clippers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Los Angeles Lakers" id="lakers" name="teams">
                        <label class="form-check-label" for="lakers">
                            Los Angeles Lakers
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
            <div class="row m-5">NFL
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Chicago Bears" id="bears" name="teams">
                        <label class="form-check-label" for="bears">
                            Chicago Bears
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Detroit Lions" id="lions" name="teams">
                        <label class="form-check-label" for="lions">
                            Detroit Lions
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Green Bay Packers" id="packers" name="teams">
                        <label class="form-check-label" for="packers">
                            Green Bay Packers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Minnesota Vikings" id="vikings" name="teams">
                        <label class="form-check-label" for="vikings">
                            Minnesota Vikings
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Dallas Cowboys" id="cowboys" name="teams">
                        <label class="form-check-label" for="cowboys">
                            Dallas Cowboys
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="New York Giants" id="giants" name="teams">
                        <label class="form-check-label" for="giants">
                            New York Giants
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Philadelphia Eagles" id="eagles" name="teams">
                        <label class="form-check-label" for="eagles">
                            Philadelphia Eagles
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Washington Commanders" id="commanders" name="teams">
                        <label class="form-check-label" for="commanders">
                            Washington Commanders
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Atlanta Falcons" id="falcons" name="teams">
                        <label class="form-check-label" for="falcons">
                            Atlanta Falcons
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Carolina Panthers" id="panthers" name="teams">
                        <label class="form-check-label" for="panthers">
                            Carolina Panthers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="New Orleans Saints" id="saints" name="teams">
                        <label class="form-check-label" for="saints">
                            New Orleans Saints
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Tampa Bay Buccaneers" id="buccaneers" name="teams">
                        <label class="form-check-label" for="buccaneers">
                            Tampa Bay Buccaneers
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Arizona Cardinals" id="arizonaCardinals" name="teams">
                        <label class="form-check-label" for="arizonaCardinals">
                            Arizona Cardinals
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Los Angeles Rams" id="rams" name="teams">
                        <label class="form-check-label" for="rams">
                            Los Angeles Rams
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="San Francisco 49ers" id="49ers" name="teams">
                        <label class="form-check-label" for="49ers">
                            San Francisco 49ers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Seattle Seahawks" id="seahawks" name="teams">
                        <label class="form-check-label" for="seahawks">
                            Seattle Seahawks
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Buffalo Bills" id="bills" name="teams">
                        <label class="form-check-label" for="bills">
                            Buffalo Bills
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Miami Dolphins" id="dolphins" name="teams">
                        <label class="form-check-label" for="dolphins">
                            Miami Dolphins
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="New England Patriots" id="patriots" name="teams">
                        <label class="form-check-label" for="patriots">
                            New England Patriots
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="New York Jets" id="jets" name="teams">
                        <label class="form-check-label" for="jets">
                            New York Jets
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Baltimore Ravens" id="ravens" name="teams">
                        <label class="form-check-label" for="ravens">
                            Baltimore Ravens
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Cincinnati Bengals" id="bengals" name="teams">
                        <label class="form-check-label" for="bengals">
                            Cincinnati Bengals
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Cleveland Browns" id="browns" name="teams">
                        <label class="form-check-label" for="browns">
                            Cleveland Browns
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Pittsburgh Steelers" id="steelers" name="teams">
                        <label class="form-check-label" for="steelers">
                            Pittsburgh Steelers
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Houston Texans" id="texans" name="teams">
                        <label class="form-check-label" for="texans">
                            Houston Texans
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Indianapolis Colts" id="colts" name="teams">
                        <label class="form-check-label" for="colts">
                            Indianapolis Colts
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Jacksonville Jaguars" id="jaguars" name="teams">
                        <label class="form-check-label" for="jaguars">
                            Jacksonville Jaguars
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Tennessee Titans" id="titans" name="teams">
                        <label class="form-check-label" for="titans">
                            Tennessee Titans
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Denver Broncos" id="broncos" name="teams">
                        <label class="form-check-label" for="broncos">
                            Denver Broncos
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Kansas City Chiefs" id="chiefs" name="teams">
                        <label class="form-check-label" for="chiefs">
                            Kansas City Chiefs
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Las Vegas Raiders" id="raiders" name="teams">
                        <label class="form-check-label" for="raiders">
                            Las Vegas Raiders
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Los Angeles Chargers" id="chargers" name="teams">
                        <label class="form-check-label" for="chargers">
                            Los Angeles Chargers
                        </label>
                    </div>
                </div>
            </div>

            <div class="row m-5">NHL
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Carolina Hurricanes" id="hurricanes" name="teams">
                        <label class="form-check-label" for="hurricanes">
                            Carolina Hurricanes
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Columbus Blue Jackets" id="blueJackets" name="teams">
                        <label class="form-check-label" for="blueJackets">
                            Columbus Blue Jackets
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="New Jersey Devils" id="devils" name="teams">
                        <label class="form-check-label" for="devils">
                            New Jersey Devils
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="New York Islanders" id="islanders" name="teams">
                        <label class="form-check-label" for="islanders">
                            New York Islanders
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="New York Rangers" id="rangers" name="teams">
                        <label class="form-check-label" for="rangers">
                            New York Rangers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Philadelphia Flyers" id="flyers" name="teams">
                        <label class="form-check-label" for="flyers">
                            Philadelphia Flyers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Pittsburgh Penguins" id="penguins" name="teams">
                        <label class="form-check-label" for="penguins">
                            Pittsburgh Penguins
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Washington Capitals" id="capitals" name="teams">
                        <label class="form-check-label" for="capitals">
                            Washington Capitals
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Boston Bruins" id="bruins" name="teams">
                        <label class="form-check-label" for="bruins">
                            Boston Bruins
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Buffalo Sabres" id="sabres" name="teams">
                        <label class="form-check-label" for="sabres">
                            Buffalo Sabres
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Detroit Red Wings" id="redWings" name="teams">
                        <label class="form-check-label" for="redWings">
                            Detroit Red Wings
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Florida Panthers" id="floridaPanthers" name="teams">
                        <label class="form-check-label" for="floridaPanthers">
                            Florida Panthers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Montreal Canadiens" id="canadiens" name="teams">
                        <label class="form-check-label" for="canadiens">
                            Montreal Canadiens
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Ottawa Senators" id="senators" name="teams">
                        <label class="form-check-label" for="senators">
                            Ottawa Senators
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Tampa Bay Lightning" id="lightning" name="teams">
                        <label class="form-check-label" for="lightning">
                            Tampa Bay Lightning
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Toronto Maple Leafs" id="leafs" name="teams">
                        <label class="form-check-label" for="leafs">
                            Toronto Maple Leafs
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Arizona Coyotes" id="coyotes" name="teams">
                        <label class="form-check-label" for="coyotes">
                            Arizona Coyotes
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Chicago Blackhawks" id="blackhawks" name="teams">
                        <label class="form-check-label" for="blackhawks">
                            Chicago Blackhawks
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Colorado Avalanche" id="avalanche" name="teams">
                        <label class="form-check-label" for="avalanche">
                            Colorado Avalanche
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Dallas Stars" id="stars" name="teams">
                        <label class="form-check-label" for="stars">
                            Dallas Stars
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Minnesota Wild" id="wild" name="teams">
                        <label class="form-check-label" for="wild">
                            Minnesota Wild
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Nashville Predators" id="predators" name="teams">
                        <label class="form-check-label" for="predators">
                            Nashville Predators
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="St. Louis Blues" id="blues" name="teams">
                        <label class="form-check-label" for="blues">
                            St. Louis Blues
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Winnipeg Jets" id="winnipegJets" name="teams">
                        <label class="form-check-label" for="winnipegJets">
                            Winnipeg Jets
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Anaheim Ducks" id="ducks" name="teams">
                        <label class="form-check-label" for="ducks">
                            Anaheim Ducks
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Calgary Flames" id="flames" name="teams">
                        <label class="form-check-label" for="flames">
                            Calgary Flames
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Edmonton Oilers" id="oilers" name="teams">
                        <label class="form-check-label" for="oilers">
                            Edmonton Oilers
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Los Angeles Kings" id="laKings" name="teams">
                        <label class="form-check-label" for="laKings">
                            Los Angeles Kings
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="San Jose Sharks" id="sharks" name="teams">
                        <label class="form-check-label" for="sharks">
                            San Jose Sharks
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Seattle Kraken" id="kraken" name="teams">
                        <label class="form-check-label" for="kraken">
                            Seattle Kraken
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Vancouver Canucks" id="canucks" name="teams">
                        <label class="form-check-label" for="canucks">
                            Vancouver Canucks
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="Vegas Golden Knights" id="goldenKnights" name="teams">
                        <label class="form-check-label" for="goldenKnights">
                            Vegas Golden Knights
                        </label>
                    </div>
                </div>
            </div>
        <input type="submit" value="save favorite teams"/>
        </form>
        <h2>Your Favorite Teams:</h2>
            <table>
                <c:forEach var="team" items="${sessionScope.userObject.teams}">
                    <tr>
                        <td><c:out value="${team.name}"/><button type="submit" name="delete" value="${team.id}">delete</button></td>
                    </tr>
                </c:forEach>
            </table>
    </div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>
