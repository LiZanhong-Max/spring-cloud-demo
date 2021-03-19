package com.zztr.serviceb.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("SERVICE-A")
public interface ServiceAFeignClient {
    @RequestMapping("/a/hello")
    public String hello();
}
