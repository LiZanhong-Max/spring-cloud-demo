package com.zztr.hmilyorder.service;

import java.math.BigDecimal;

public interface IOrderService {
    public String orderPay(Integer count, BigDecimal amount);
}
