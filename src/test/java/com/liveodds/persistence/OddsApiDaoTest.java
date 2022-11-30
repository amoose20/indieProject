package com.liveodds.persistence;

import com.liveodds.restapi.Odds;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddsApiDaoTest {

    OddsApiDao oddsDao;

    @Test
    void getHomeTeam() throws Exception {
        Odds[] odds = oddsDao.build();
        String homeTeam = odds[0].getHomeTeam();
        assertNotNull(odds);
        assertEquals("a string", homeTeam);
    }

}
