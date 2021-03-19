package com.zztr.hmilystock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.zztr.hmilystock.mapper")
@EnableEurekaClient
@EnableFeignClients
public class HmilyStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(HmilyStockApplication.class, args);
    }

}
