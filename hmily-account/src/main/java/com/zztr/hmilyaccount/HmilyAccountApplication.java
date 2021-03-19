package com.zztr.hmilyaccount;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.zztr.hmilyaccount.mapper")
@EnableEurekaClient
@EnableFeignClients
public class HmilyAccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(HmilyAccountApplication.class, args);
    }
}
