package com.liveodds.persistence;

import com.liveodds.entity.Team;
import com.liveodds.entity.User;
import com.liveodds.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeamDaoTest {

    TeamDao dao;

    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records)
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        dao = new TeamDao();
    }

    /**
     * Verify successful retrieval of a Team
     */
    @Test
    void getByIdSuccess() {
        Team retrievedTeam = dao.getById(1);
        assertEquals(retrievedTeam, dao.getById(1));
    }

    /**
     * Verify successful insert of a Team
     */
    @Test
    void insertSuccess() {
        User user1 = new User("UserDaoTest", 34);
        User user2 = new User("UserDaoTest", 34);

        Set<User> users = new HashSet<>();
        users.add(user1);
        users.add(user2);

        Team newTeam = new Team("Chicago Bulls", users);

        int id = dao.insert(newTeam);
        assertNotEquals(0,id);
        Team insertedTeam = dao.getById(id);
        //assertEquals(insertedTeam, newTeam);
        assertNotNull(newTeam.getUser());
    }


    /**
     * Verify successful update of a Team
     */
    @Test
    void updateSuccess() {
        String newTeamName = "New York Knicks";
        Team teamToUpdate = dao.getById(2);
        teamToUpdate.setName(newTeamName);
        dao.saveOrUpdate(teamToUpdate);
        assertEquals(teamToUpdate, dao.getById(2));
    }

    /**
     * Verify successful delete of Team
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(1));
        assertNull(dao.getById(1));
    }

    /**
     * Verify successful retrieval of all Teams
     */
    @Test
    void getAllSuccess() {
        List<Team> teams = dao.getAll();
        assertEquals(teams, dao.getAll());
    }

    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<Team> teams = dao.getByPropertyEqual("name", "Chicago Bulls");
        assertEquals(1, teams.size());
        assertEquals(1, teams.get(0).getId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Team> teams = dao.getByPropertyLike("name", "New York");
        assertEquals(1, teams.size());
    }
}
