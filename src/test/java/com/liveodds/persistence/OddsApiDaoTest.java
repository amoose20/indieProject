package com.liveodds.persistence;

import com.liveodds.restapi.Odds;
import com.liveodds.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddsApiDaoTest {

    OddsApiDao oddsDao;

    @BeforeEach
    void setUp() {
        oddsDao = new OddsApiDao();
    }

    @Test
    void getHomeTeam() throws Exception {
        Odds[] odds = oddsDao.build("basketball");
        String homeTeam = odds[1].getHomeTeam();
        assertNotNull(odds);
        assertEquals("a string", homeTeam);
    }
    @Test
    void getBookMakers() throws Exception {
        Odds[] odds = oddsDao.build("basketball");
        List bookMakers = odds[1].getBookmakers();
        assertNotNull(odds);
        assertEquals("a string", bookMakers);

    }

}
