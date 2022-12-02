package com.liveodds.persistence;

import com.liveodds.restapi.BookmakersItem;
import com.liveodds.restapi.MarketsItem;
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
        assertEquals("a string", bookMakers);

    }

    @Test
    void getMarkets() throws Exception {
        Odds[] odds = oddsDao.build("basketball");
        List<BookmakersItem> bookMakers = odds[1].getBookmakers();
        List<MarketsItem> markets = bookMakers.get(1).getMarkets();
        assertEquals("a string", markets);

    }

}
