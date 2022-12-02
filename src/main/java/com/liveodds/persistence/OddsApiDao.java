package com.liveodds.persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.liveodds.restapi.Odds;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;


public class OddsApiDao {

    public Odds[] build(String sport) throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.the-odds-api.com/v4/sports/" + sport + "/odds/?apiKey=367caaa06fb3d3d2417736e7bda846b6&regions=us&oddsFormat=american");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        Odds[] odds = mapper.readValue(response, Odds[].class);
        return odds;
    }
}
