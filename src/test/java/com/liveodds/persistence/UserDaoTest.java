package com.liveodds.persistence;

import com.liveodds.entity.User;
import com.liveodds.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

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
        assertEquals(1, users.size());
    }

    @Test
    void getByIdSuccess() {
        User retrievedUser = dao.getById(1);
        assertNotNull(retrievedUser);
        assertEquals(retrievedUser, dao.getById(1));
    }

    @Test
    void saveOrUpdate() {
        User userToUpdate = dao.getById(2);
        userToUpdate.setFirstName("Update");
        userToUpdate.setLastName("Test");
        dao.saveOrUpdate(userToUpdate);
        User userAfterUpdate = dao.getById(2);
        assertEquals(userToUpdate, userAfterUpdate);
    }

    @Test
    void insert() {
        User user = new User("Test", "User", 30);
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
}