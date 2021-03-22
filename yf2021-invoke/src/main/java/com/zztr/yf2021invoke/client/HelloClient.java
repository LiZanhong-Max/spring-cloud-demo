package com.zztr.yf2021invoke.client;

import com.zztr.yf2021common.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("YF2021-SERVICE") //IP:PORT
public interface HelloClient {
    @GetMapping("/hello") //URL
    public String sayHello(); //参数

    @GetMapping("/get")
    public String get(@RequestParam String a,
                      @RequestParam int b);

    @PostMapping("/post")
    public User post(@RequestBody User user);
}
