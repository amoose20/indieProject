package com.liveodds.persistence;

import com.liveodds.entity.Team;
import com.liveodds.entity.User;
import com.liveodds.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

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

        UserDao userDao = new UserDao();
        User user = userDao.getById(1);

        Team newTeam = new Team("Chicago Cubs", user, 1);

        user.addTeams(newTeam);

        int id = dao.insert(newTeam);
        assertNotEquals(0,id);
        Team insertedTeam = dao.getById(id);
        assertEquals(insertedTeam, newTeam);
    }


    /**
     * Verify successful update of a Team
     */
    @Test
    void updateSuccess() {
        String newTeamName = "Chicago Bulls";
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
        dao.delete(dao.getById(3));
        assertNull(dao.getById(3));
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
        List<Team> teams = dao.getByPropertyEqual("publicationYear", "2005");
        assertEquals(1, teams.size());
        assertEquals(1, teams.get(0).getId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Team> teams = dao.getByPropertyLike("isbn", "9");
        assertEquals(3, teams.size());
    }
}
