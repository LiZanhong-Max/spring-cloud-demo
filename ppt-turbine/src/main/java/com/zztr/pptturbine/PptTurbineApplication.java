package com.zztr.pptturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class PptTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(PptTurbineApplication.class, args);
    }

}
