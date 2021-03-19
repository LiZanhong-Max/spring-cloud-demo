package com.zztr.yf2021springboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @PostMapping("/")
    public String doOrder(Order order){
        System.out.println("下订单");
        System.out.println(order);
        return "success";
    }

    @GetMapping("/")
    public String getOrders(){
        System.out.println("查询所有订单");
        return "success";
    }

    @GetMapping("/{orderId}")
    public String getOrder(@PathVariable String orderId){
        System.out.println("查询一个订单");
        return "success";
    }

    @PutMapping("/")
    public String updateOrder(Order order){
        System.out.println("修改一个订单");
        System.out.println(order);
        return "success";
    }
}
