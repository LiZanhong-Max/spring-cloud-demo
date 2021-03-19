package com.zztr.pptinvoke2.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("PPT-SERVICE")
public interface PptServiceCleint {
    @RequestMapping(value = "/service/hello")
    public String sayHello();
}
