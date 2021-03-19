package com.zztr.hmilyorder.service;

import com.zztr.hmilyorder.entity.Order;
import com.zztr.hmilyorder.entity.OrderStatus;
import com.zztr.hmilyorder.mapper.OrderMapper;
import org.dromara.hmily.common.utils.IdWorkerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class OrderService implements IOrderService{
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private IPayingService payingService;

    public Boolean mockSaveOrder(Order order){
        orderMapper.save(order);
        return true;
    }

    /**
     * 订单支付
     * @param count
     * @param amount
     * @return
     */
    @Override
    public String orderPay(Integer count, BigDecimal amount) {
        System.out.println("开始下单……");
        Order order = saveOrder(count, amount);
        System.out.println("订单已保存");
        System.out.println("开始支付……");
        payingService.makePayment(order);
        return "success";
    }

    private Order saveOrder(Integer count, BigDecimal amount) {
        final Order order = buildOrder(count, amount);
        orderMapper.save(order);
        return order;
    }

    private Order buildOrder(Integer count, BigDecimal amount) {
        Order order = new Order();
        order.setCreateTime(new Date());
        order.setNumber(String.valueOf(IdWorkerUtils.getInstance().createUUID()));
        //demo中的表里只有商品id为 1的数据
        order.setProductId("1");
        order.setStatus(OrderStatus.NOT_PAY.getId());
        order.setTotalAmount(amount);
        order.setCount(count);
        //demo中 表里面存的用户id为10000
        order.setUserId("10000");
        return order;
    }
}
