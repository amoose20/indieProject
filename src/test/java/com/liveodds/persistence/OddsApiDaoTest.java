package com.liveodds.persistence;

import com.liveodds.restapi.Odds;
import com.liveodds.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        Odds[] odds = oddsDao.build();
        String homeTeam = odds[1].getHomeTeam();
        assertNotNull(odds);
        assertEquals("a string", homeTeam);
    }

}
