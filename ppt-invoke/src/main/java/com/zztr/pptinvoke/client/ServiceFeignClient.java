package com.zztr.pptinvoke.client;

import com.zztr.pptcommon.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(value = "PPT-SERVICE", fallback = HystrixServiceFeignClient.class)
//, fallbackFactory = HystrixServiceFeignClientFactory.class
@FeignClient(value = "PPT-SERVICE")
public interface ServiceFeignClient {
    @RequestMapping(value = "/service/hello")
    public String sayHello();
    @RequestMapping("/service/go")
    public String go(@RequestParam String a, @RequestParam int b);
    @RequestMapping("/service/user")
    public User user(@RequestBody User user);
}
