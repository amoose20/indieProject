package com.liveodds.controller;

import com.liveodds.persistence.OddsApiDao;
import com.liveodds.restapi.Odds;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/odds"}
)

public class BuildOdds extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        OddsApiDao oddsDao = new OddsApiDao();

        try {
            Odds[] nba = oddsDao.build("basketball_nba");
            req.setAttribute("nbaGameDetails", nba);

            Odds[] nfl = oddsDao.build("americanfootball_nfl");
            req.setAttribute("nflGameDetails", nfl);

            Odds[] nhl = oddsDao.build("icehockey_nhl");
            req.setAttribute("nhlGameDetails", nhl);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/odds.jsp");
        dispatcher.forward(req, resp);
    }
}
