package com.zztr.hmilystock.dto;

import java.io.Serializable;

public class InventoryDTO implements Serializable {

    private static final long serialVersionUID = 8229355519336565493L;

    /**
     * ååid.
     */
    private String productId;

    /**
     * æ°é.
     */
    private Integer count;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}

