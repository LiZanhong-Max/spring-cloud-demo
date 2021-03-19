package com.zztr.pptinvoke2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class PptInvoke2Application {

    public static void main(String[] args) {
        SpringApplication.run(PptInvoke2Application.class, args);
    }
}
