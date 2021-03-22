package com.zztr.yf2021invoke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Yf2021InvokeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Yf2021InvokeApplication.class, args);
    }

}
