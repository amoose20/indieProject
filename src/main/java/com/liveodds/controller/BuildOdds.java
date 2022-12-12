package com.liveodds.controller;

import com.liveodds.entity.Team;
import com.liveodds.entity.User;
import com.liveodds.persistence.OddsApiDao;
import com.liveodds.persistence.UserDao;
import com.liveodds.restapi.Odds;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@WebServlet(
        urlPatterns = {"/odds"}
)

/**
 * This servlet generates the API requests and builds the Odds object for each request.
 * Each odds object is placed in the request as an attribute.
 * Number of user's favorite teams contained in the API response is generated, also put in request as attribute
 */
public class BuildOdds extends HttpServlet {

    ArrayList<String> allTeams = new ArrayList<>();

    Set<Team> teams = new HashSet<Team>();

    UserDao userDao = new UserDao();
    OddsApiDao oddsDao = new OddsApiDao();
    String userName = "";
    Integer favoriteTeamCount = 0;

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        userName = (String) session.getAttribute("userName");

        User user = (User) session.getAttribute("userObject");

        try {
            Odds[] nba = oddsDao.build("basketball_nba");
            allTeams = buildTeams(nba);
            req.setAttribute("nbaGameDetails", nba);

            Odds[] nfl = oddsDao.build("americanfootball_nfl");
            allTeams = buildTeams(nfl);
            req.setAttribute("nflGameDetails", nfl);

            Odds[] nhl = oddsDao.build("icehockey_nhl");
            allTeams = buildTeams(nhl);
            req.setAttribute("nhlGameDetails", nhl);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        teams = user.getTeams();

        for (int i = 0; i < teams.size(); i++) {
            if (allTeams.contains(teams.iterator().next().getName())) {
                favoriteTeamCount++;
            }
        }
        logger.info("favoriteTeamCount: " + favoriteTeamCount);
        req.setAttribute("favoriteTeamCount", favoriteTeamCount);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/odds.jsp");
        dispatcher.forward(req, resp);
    }

    private ArrayList<String> buildTeams(Odds[] odds) {
        for (int i = 0; i < odds.length; i++) {
            String homeTeam = odds[i].getHomeTeam();
            String awayTeam = odds[i].getAwayTeam();
            allTeams.add(homeTeam);
            allTeams.add(awayTeam);
        }
        return allTeams;
    }
}
