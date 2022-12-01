package com.liveodds.controller;

import com.liveodds.persistence.OddsApiDao;
import com.liveodds.persistence.UserDao;
import com.liveodds.restapi.Odds;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(
        urlPatterns = {"/teams"}
)

public class BasketballOdds extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        OddsApiDao oddsDao = new OddsApiDao();
        ArrayList<String> homeTeams = new ArrayList<String>();
        try {
            Odds[] oddsList = oddsDao.build();
            for (int i = 0; i < oddsList.length; i++) {
                homeTeams.add(oddsList[i].getHomeTeam());
            }
            req.setAttribute("basketballHomeTeams", homeTeams);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }
}
