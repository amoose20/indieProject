package com.liveodds.persistence;

import com.liveodds.restapi.BookmakersItem;
import com.liveodds.restapi.MarketsItem;
import com.liveodds.restapi.Odds;
import com.liveodds.restapi.OutcomesItem;
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
    void getOddsSuccess() throws Exception {
        Odds[] odds = oddsDao.build("basketball");
        String homeTeam = odds[1].getHomeTeam();
        String awayTeam = odds[1].getAwayTeam();
        String sportsTitle = odds[1].getSportTitle();
        List<BookmakersItem> bookmakers = odds[1].getBookmakers();

        assertNotNull(homeTeam);
        assertNotNull(awayTeam);
        assertNotNull(sportsTitle);
        assertNotNull(bookmakers);
    }
    @Test
    void getBookMakersSuccess() throws Exception {
        Odds[] odds = oddsDao.build("basketball");
        List bookMakers = odds[1].getBookmakers();
        assertNotNull(bookMakers);

    }

    @Test
    void getMarketsSuccess() throws Exception {
        Odds[] odds = oddsDao.build("basketball");
        List<BookmakersItem> bookMakers = odds[1].getBookmakers();
        List<MarketsItem> markets = bookMakers.get(1).getMarkets();
        assertNotNull(markets);

    }

    @Test
    void getOutcomesSuccess() throws Exception {
        Odds[] odds = oddsDao.build("basketball");
        List<BookmakersItem> bookMakers = odds[1].getBookmakers();
        List<MarketsItem> markets = bookMakers.get(1).getMarkets();
        List<OutcomesItem> outcomes = markets.get(0).getOutcomes();
        assertNotNull(outcomes);

    }

}
