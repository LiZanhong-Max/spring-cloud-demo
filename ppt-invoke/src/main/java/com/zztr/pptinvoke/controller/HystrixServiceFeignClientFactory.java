package com.zztr.pptinvoke.controller;

import com.zztr.pptcommon.entity.User;
import com.zztr.pptinvoke.client.ServiceFeignClient;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixServiceFeignClientFactory implements FallbackFactory<ServiceFeignClient> {
    @Override
    public ServiceFeignClient create(Throwable cause) {
        return new ServiceFeignClient() {
            @Override
            public String sayHello() {
                return cause.getMessage();
            }

            @Override
            public String go(String a, int b) {
                return "go";
            }

            @Override
            public User user(User user) {
                return null;
            }
        };
    }
}
