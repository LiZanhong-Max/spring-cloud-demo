package com.zztr.pptservice.controller;

import com.zztr.pptcommon.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service")
public class HelloController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String hello(){
        return "Hello " + port;
    }

    @GetMapping("/nihao")
    public String nihao(String name){
        return name + ",你好! " + port;
    }

    @GetMapping("/go")
    public String go(String a, int b){
        return a + b;
    }

    @PostMapping("/user")
    public User user(@RequestBody User user){
        System.out.println(user);
        return user;
    }
}
