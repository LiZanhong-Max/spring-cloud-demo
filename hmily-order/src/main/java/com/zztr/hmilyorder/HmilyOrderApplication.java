package com.zztr.hmilyorder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.zztr.hmilyorder.mapper")
@EnableEurekaClient
@EnableFeignClients
public class HmilyOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HmilyOrderApplication.class, args);
    }

}
