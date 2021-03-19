package com.zztr.hmilyorder.entity;

public enum OrderStatus {
    NOT_PAY(1, "未支付"),
    PAYING(2, "正在支付"),
    PAY_FAIL(3, "支付失败"),
    PAY_SUCCESS(4, "支付成功");

    OrderStatus(int id, String status) {
        this.id = id;
        this.status = status;
    }

    private int id;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
