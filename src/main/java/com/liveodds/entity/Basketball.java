package com.liveodds.entity;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class Basketball {

    public void build() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.the-odds-api.com/v4/sports/basketball/odds/?apiKey=8e2bac2b3afc388d96abd8059f8cacb0&regions=us&oddsFormat=american");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        Odds[] odds = mapper.readValue(response, Odds[].class);
    }

}
