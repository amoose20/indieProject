package com.liveodds.controller;

import com.liveodds.entity.Team;
import com.liveodds.entity.User;
import com.liveodds.persistence.TeamDao;
import com.liveodds.persistence.UserDao;
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
import java.util.*;


@WebServlet("/favoriteTeams")
public class favoriteTeams extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());
    UserDao userDao = new UserDao();

    ArrayList<String> allTeams = new ArrayList<>();
    TeamDao teamDao = new TeamDao();
    Set<Team> existingTeams = new HashSet<Team>();
    Set<Team> newTeams = new HashSet<Team>();

    String userName = "";

    Integer favoriteTeamCount = 0;


    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        String[] favoriteTeams = req.getParameterValues("teams");

        User user = (User) session.getAttribute("userObject");
        existingTeams = user.getTeams();

        for (String team : favoriteTeams) {
            if (!existingTeams.contains(team)) {
                Team newTeam  = teamDao.getByPropertyEqual("name", team).get(0);
                newTeams.add(newTeam);
            }

        }
        user.setTeams(newTeams);
        userDao.saveOrUpdate(user);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }

}
