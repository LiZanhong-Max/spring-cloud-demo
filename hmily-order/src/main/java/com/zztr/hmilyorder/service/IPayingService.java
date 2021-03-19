package com.zztr.hmilyorder.service;

import com.zztr.hmilyorder.entity.Order;

public interface IPayingService {
    public void makePayment(Order order);
}
