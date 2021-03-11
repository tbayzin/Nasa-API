package com.client;

import com.model.Planet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CallRestService implements CommandLineRunner {

    private static void CallRestService() {

        RestTemplate restTemplate = new RestTemplate();
        Planet planet = restTemplate.getForObject ("https://api.nasa.gov/insight_weather/?api_key=DEMO_KEY&feedtype=json&ver=1.0/1",Planet.class);
        System.out.println("Gezegenler " + planet.getFirstUtc());
    }

    @Override
    public void run(String... args) throws Exception {
        CallRestService();
    }
}
