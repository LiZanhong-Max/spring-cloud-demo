package com.zztr.springbootdemo.controller;

import com.zztr.springbootdemo.vo.Order;
import com.zztr.springbootdemo.vo.Result;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiZanhong
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping("/")
    public Result newOrder(Order order){
        System.out.println("下单：" + order);
        return new Result();
    }

    @PutMapping("/")
    public Result updateOrder(Order order){
        System.out.println("修改订单：" + order);
        return new Result();
    }

    @DeleteMapping("/{orderId}")
    public Result deleteOrder(@PathVariable("orderId") String orderId){
        System.out.println("删除一条订单");
        return new Result();
    }

    @GetMapping("/{orderId}")
    public Order getOrder(@PathVariable String orderId){
        System.out.println("查询一条订单");
        return new Order();
    }

    @GetMapping("/")
    public List<Order> getOrders(){
        System.out.println("查询所有订单");
        return new ArrayList<Order>();
    }
}
