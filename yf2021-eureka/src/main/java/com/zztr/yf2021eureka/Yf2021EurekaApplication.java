package com.zztr.yf2021eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Yf2021EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Yf2021EurekaApplication.class, args);
    }

}
