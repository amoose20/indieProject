import com.fasterxml.jackson.databind.ObjectMapper;
import com.liveodds.entity.Sports;
import com.liveodds.entity.SportsItem;
import org.junit.Test;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServiceClient {

    /*@Test
    public void testSportsJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.the-odds-api.com/v4/sports/?apiKey=8e2bac2b3afc388d96abd8059f8cacb0");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        Sports sports = mapper.readValue(response, Sports.class);
        List<SportsItem> expectedSports;
        assertEquals(expectedSports, sports.getSports());
    }*/
}