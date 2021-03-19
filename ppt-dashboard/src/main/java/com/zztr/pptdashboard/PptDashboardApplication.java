package com.zztr.pptdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class PptDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(PptDashboardApplication.class, args);
    }

}
