package com.zztr.hmilyorder.client;

import org.dromara.hmily.annotation.Hmily;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("ACCOUNT-SERVICE")
public interface AccountClient {
    @RequestMapping("/account/payment")
    @Hmily
    public Boolean payment(@RequestParam("userId") String userId,
                           @RequestParam("amount") Double amount);
}
