package com.liveodds.controller;

import com.liveodds.entity.Team;
import com.liveodds.entity.User;
import com.liveodds.persistence.UserDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


@WebServlet("/favoriteTeams")
public class favoriteTeams extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String[] favoriteTeams = req.getParameterValues("teams");
        Set<Team> teams = new HashSet<Team>();
        UserDao dao = new UserDao();
        for (String team : favoriteTeams) {
            logger.info(team);
            Team newTeam = new Team(team);
            teams.add(newTeam);
        }

    }
}
