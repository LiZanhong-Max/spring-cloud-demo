package com.zztr.springbootdemo.vo2;

public class Result {
    private Boolean status = true;
    private int code = 200;
    private String message;
    private Object data;

    public Result() {
    }

    public Result(Boolean status, int code, String message, Object data) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
