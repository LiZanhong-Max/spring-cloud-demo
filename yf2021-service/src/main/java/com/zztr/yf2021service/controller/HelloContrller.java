package com.zztr.yf2021service.controller;

import com.zztr.yf2021common.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContrller {
    @Value("${server.port}")
    private int port;

    @GetMapping("/hello")
    public String hello(){
        return "Hello " + port;
    }

    @GetMapping("/get")
    public String get(String a, int b){
        return a + "/" + b + " " + port;
    }

    @PostMapping("/post")
    public User post(@RequestBody User user){
        return user;
    }
}
