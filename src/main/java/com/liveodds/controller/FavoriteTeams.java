package com.liveodds.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FavoriteTeams extends HttpServlet {

    /*I believe this servlet should:
    * 1. Get selected teams from the form
    * 2. Add the teams to the user object
    * */

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String[] favoriteTeams = req.getParameterValues("teams");

    }
}
