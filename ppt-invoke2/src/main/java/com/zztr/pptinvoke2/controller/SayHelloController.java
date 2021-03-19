package com.zztr.pptinvoke2.controller;

import com.zztr.pptinvoke2.client.PptServiceCleint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/invoke2")
public class SayHelloController {
    @Autowired
    private PptServiceCleint serviceFeignClient;

    @GetMapping("/say")
    public String sayHello(){
        return "say " + serviceFeignClient.sayHello();
    }
}
