package com.liveodds.persistence;

import com.liveodds.entity.Team;
import com.liveodds.entity.User;
import com.liveodds.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    UserDao dao;

    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        dao = new UserDao();
    }

    @Test
    void getAllUsersSuccess() {
        List<User> users = dao.getAllUsers();
        assertEquals(3, users.size());
    }

    @Test
    void getByIdSuccess() {
        User retrievedUser = dao.getById(1);
        Set<Team> teams = new HashSet<Team>();
        teams = retrievedUser.getTeams();
        assertEquals(teams, retrievedUser.getTeams());
        assertEquals(2, teams.size());
        assertEquals("Chicago Bulls", teams.iterator().next().getName());
        assertEquals("Austin", retrievedUser.getName());
    }

    @Test
    void saveOrUpdate() {
        User userToUpdate = dao.getById(2);
        userToUpdate.setName("UpdateTest");
        dao.saveOrUpdate(userToUpdate);
        User userAfterUpdate = dao.getById(2);
        assertEquals(userToUpdate, userAfterUpdate);
    }

    @Test
    void insert() {
        User user = new User("UserDaoTest", 34);
        Team team1 = new Team("Los Angeles Lakers");
        Team team2 = new Team("Los Angeles Clippers");

        Set<Team> teams = new HashSet<Team>();
        teams.add(team1);
        teams.add(team2);
        user.setTeams(teams);

        int id = dao.insert(user);
        assertNotEquals(0,id);
        User insertedUser = dao.getById(id);
        assertNotNull(insertedUser.getTeams());
        assertEquals("Los Angeles Lakers", insertedUser.getTeams().iterator().next().getName());
        assertEquals(user.getId(), insertedUser.getId());
    }

    @Test
    void delete() {
        TeamDao teamDao = new TeamDao();
        Team team = teamDao.getById(1);
        dao.delete(dao.getById(1));
        assertNull(dao.getById(1));
        assertNotNull(team);
    }

    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<User> users = dao.getByPropertyEqual("name", "Austin");
        assertEquals(1, users.size());
        assertEquals(1, users.get(0).getId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<User> users = dao.getByPropertyLike("name", "user");
        assertEquals(1, users.size());
    }
}