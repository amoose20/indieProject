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
        assertTrue(teams.contains("Chicago Bulls"));
        assertNotNull(retrievedUser);
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
        User user = new User("UserDao", 34);
        int id = dao.insert(user);
        assertNotEquals(0,id);
        User insertedUser = dao.getById(id);
        assertEquals(user, insertedUser);
    }

    @Test
    void delete() {
        dao.delete(dao.getById(1));
        assertNull(dao.getById(1));
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
        List<User> users = dao.getByPropertyLike("age", "30");
        assertEquals(1, users.size());
    }
}