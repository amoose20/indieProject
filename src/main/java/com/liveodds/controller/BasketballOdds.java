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
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@WebServlet(
        urlPatterns = {"/nba"}
)

public class BasketballOdds extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        OddsApiDao oddsDao = new OddsApiDao();

        try {
            Odds[] oddsList = oddsDao.build("basketball_nba");
            req.setAttribute("nbaGameDetails", oddsList);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }
}
