package com.zztr.hmilyorder.controller;

import com.zztr.hmilyorder.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class OrderController {
    @Autowired
    private IOrderService orderService;

    @GetMapping(value = "/orderPay")
    public String orderPay(@RequestParam(value = "count") Integer count,
                           @RequestParam(value = "amount") BigDecimal amount) {
        System.out.println("count:" + count);
        System.out.println("amount:" + amount);
        return orderService.orderPay(count, amount);
    }
}
