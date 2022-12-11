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
    Set<Team> teams = new HashSet<Team>();
    String userName = "";

    Integer favoriteTeamCount = 0;


    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        String[] favoriteTeams = req.getParameterValues("teams");
        userName = (String) session.getAttribute("userName");

        //get list of users
        List<User> users = userDao.getByPropertyEqual("name", userName);

        //get user object
        User user = users.get(0);

        logger.info("userName from session: " + userName);
        for (String team : favoriteTeams) {
            logger.info("Team: " + team);
            List<Team> teamList = teamDao.getByPropertyEqual("name", team);
            Team newTeam = teamList.get(0);
            teams.add(newTeam);
        }
        user.setTeams(teams);
        logger.info("userName from dao: " + user.getName());
        userDao.saveOrUpdate(user);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);

    }

}
