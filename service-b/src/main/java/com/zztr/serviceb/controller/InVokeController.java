package com.zztr.serviceb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/b")
public class InVokeController {
    @Autowired
    private ServiceAFeignClient serviceAFeignClient;

    @GetMapping("/say")
    public String sayHello() {
        String result = serviceAFeignClient.hello();
        return "invoke ---" + result;
    }
}
