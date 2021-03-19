package com.zztr.pptinvoke.controller;

import com.zztr.pptcommon.entity.User;
import com.zztr.pptinvoke.client.ServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoke")
public class SayHelloController {
    @Autowired
    private ServiceFeignClient serviceFeignClient;

    @GetMapping("/say")
    public String sayHello(){
        return "say " + serviceFeignClient.sayHello();
    }

    @GetMapping("/go")
    public String go(String a, int b){
        System.out.println("SayHelloController:go");
        return "say " + serviceFeignClient.go(a, b);
    }

    @PostMapping("/user")
    public User user(User user){
        System.out.println(user);
        return serviceFeignClient.user(user);
    }
}
