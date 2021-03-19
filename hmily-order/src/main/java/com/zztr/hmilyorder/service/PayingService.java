package com.zztr.hmilyorder.service;

import com.zztr.hmilyorder.client.AccountClient;
import com.zztr.hmilyorder.client.InventoryClient;
import com.zztr.hmilyorder.entity.Order;
import com.zztr.hmilyorder.entity.OrderStatus;
import com.zztr.hmilyorder.mapper.OrderMapper;
import org.dromara.hmily.annotation.HmilyTCC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayingService implements IPayingService{
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private AccountClient accountClient;
    @Autowired
    private InventoryClient inventoryClient;

    /**
     * 更新订单状态
     * @param order
     * @param orderStatus
     */
    private void updateOrderStatus(Order order, OrderStatus orderStatus) {
        order.setStatus(orderStatus.getId());
        orderMapper.update(order);
    }

    @HmilyTCC(confirmMethod = "confirmOrderStatus", cancelMethod = "cancelOrderStatus")
    @Override
    public void makePayment(Order order) {
        //更新订单状态——支付中
        updateOrderStatus(order, OrderStatus.PAYING);
        System.out.println("修改订单状态为……支付中");
        //支付
        System.out.println("开始支付……");
        accountClient.payment(order.getUserId(), order.getTotalAmount().doubleValue());
        System.out.println("支付完成");
        //扣减库存
        System.out.println("开始扣减库存……");
        inventoryClient.decrease(order.getProductId(), order.getCount());
        System.out.println("扣减库存完成");
    }

    public void confirmOrderStatus(Order order) {
        updateOrderStatus(order, OrderStatus.PAY_SUCCESS);
        System.out.println("修改订单状态为……支付成功");
    }

    public void cancelOrderStatus(Order order) {
        updateOrderStatus(order, OrderStatus.PAY_FAIL);
        System.out.println("修改订单状态为……支付失败");
    }
}
