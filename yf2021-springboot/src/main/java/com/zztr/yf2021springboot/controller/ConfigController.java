package com.zztr.yf2021springboot.controller;


import com.zztr.yf2021springboot.vo.ConfigVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {
    @Autowired
    private Environment environment;

    @GetMapping("/value1")
    public String value1(){
        return environment.getProperty("a.b.c");
    }

    @Value("${a.b.c}")
    private String value;
    @GetMapping("/value2")
    public String value2(){
        return value + "你好";
    }

    @Autowired
    private ConfigVo configVo;

    @GetMapping("/value3")
    public ConfigVo value3(){
        return configVo;
    }
}
