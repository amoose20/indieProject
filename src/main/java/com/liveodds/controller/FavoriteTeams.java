package com.liveodds.controller;

import com.liveodds.entity.Team;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Set;

public class FavoriteTeams extends HttpServlet {

    Set<Team> teams;

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ArrayList<String> parameterNames = new ArrayList<String>();

        Enumeration en = req.getParameterNames();

        while(en.hasMoreElements()) {
            String param = (String) en.nextElement();
            parameterNames.add(param);
            String value = req.getParameter(param);
        }

    }
}
