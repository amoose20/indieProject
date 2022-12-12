package com.liveodds.controller;

import com.liveodds.entity.Team;
import com.liveodds.entity.User;
import com.liveodds.persistence.TeamDao;
import com.liveodds.persistence.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Set;

public class deleteTeam extends HttpServlet {

    UserDao userDao = new UserDao();
    TeamDao teamDao = new TeamDao();

    Set<Team> favoriteTeams;

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        User user = (User) session.getAttribute("userObject");
        favoriteTeams = user.getTeams();

    }
}
