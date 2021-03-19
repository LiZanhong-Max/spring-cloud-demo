package com.zztr.springbootdemo.controller;

import com.zztr.springbootdemo.vo.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Autowired
    private Environment environment;

    @GetMapping("/env")
    public String env(){
        return environment.getProperty("a.b.c");
    }


    @Value("${a.b.c}")
    private String abc;

    @GetMapping("/value")
    public String value(){
        int a = 5 / 0;
        return abc;
    }

    @Autowired
    private Config config;

    @GetMapping("/bean")
    public String bean(){
        return config.toString() + "abc111土f11111111111111111111111";
    }
}
