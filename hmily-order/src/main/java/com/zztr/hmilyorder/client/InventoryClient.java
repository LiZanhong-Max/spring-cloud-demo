package com.zztr.hmilyorder.client;

import org.dromara.hmily.annotation.Hmily;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("STOCK-SERVICE")
public interface InventoryClient {
    @RequestMapping("/stock/decrease")
    @Hmily
    public Boolean decrease(@RequestParam("productId") String productId,
                            @RequestParam("count") Integer count);
}
