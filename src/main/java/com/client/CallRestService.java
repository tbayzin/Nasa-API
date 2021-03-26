package com.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Component
public class CallRestService implements CommandLineRunner {

    private static void CallRestService() {

        RestTemplate restTemplate = new RestTemplate();
        // Objenin adı string olduğu için ilki string ve içindekilerde obje olduğu için ikincisi Object
        HashMap<String, Object> planet = restTemplate.getForObject ("https://api.nasa.gov/insight_weather/?api_key=DEMO_KEY&feedtype=json&ver=1.0/",HashMap.class);

        // Verilen objedeki numarayı alır
        System.out.println("Gezegenler " + planet.get("821"));



    }

    @Override
    public void run(String... args) throws Exception {
        CallRestService();
    }
}
