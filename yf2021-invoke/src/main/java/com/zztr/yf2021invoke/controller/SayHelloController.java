package com.zztr.yf2021invoke.controller;

import com.zztr.yf2021common.entity.User;
import com.zztr.yf2021invoke.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {
    @Autowired
    private HelloClient helloClient;

    @GetMapping("/say")
    public String sayHello(){
        return helloClient.sayHello();
    }

    @GetMapping("/get")
    public String get(String a, int b){
        return helloClient.get(a, b);
    }

    @PostMapping("/post")
    public User post(User user){
        return helloClient.post(user);
    }
}
