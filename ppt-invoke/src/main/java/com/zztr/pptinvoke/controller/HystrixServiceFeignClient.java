package com.zztr.pptinvoke.controller;

import com.zztr.pptcommon.entity.User;
import com.zztr.pptinvoke.client.ServiceFeignClient;
import org.springframework.stereotype.Component;

@Component
public class HystrixServiceFeignClient implements ServiceFeignClient {
    @Override
    public String sayHello() {
        return "error";
    }

    @Override
    public String go(String a, int b) {
        return "error";
    }

    @Override
    public User user(User user) {
        return null;
    }
}
