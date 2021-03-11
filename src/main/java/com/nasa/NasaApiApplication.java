package com.nasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.client"})
public class NasaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NasaApiApplication.class, args);
    }

}
