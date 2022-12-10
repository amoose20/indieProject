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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@WebServlet("/favoriteTeams")
public class favoriteTeams extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());
    UserDao userDao = new UserDao();
    Set<Team> teams = new HashSet<Team>();
    String userName = "";


    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        String[] favoriteTeams = req.getParameterValues("teams");
        userName = (String) session.getAttribute("userName");
        List<User> user = userDao.getByPropertyEqual("name", userName);
        for (String team : favoriteTeams) {
            logger.info("Team: " + team);
            Team newTeam = new Team(team);
            teams.add(newTeam);
        }
        user.get(0).setTeams(teams);
        userDao.saveOrUpdate(user.get(0));
    }
}
