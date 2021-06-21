package com.nasa;

import com.client.CallRestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@ComponentScan({"com.client"})
@EnableScheduling
public class NasaApiApplication {

    private final static int MINUTE = 60 * 1000;


    public static void main(String[] args) {
        SpringApplication.run(NasaApiApplication.class, args);
    }


    CallRestService callRestService = new CallRestService();

    @Scheduled(fixedRate = 60 * 60 *10)
    public void checkEndpointTimer() {
        try {
            callRestService.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
