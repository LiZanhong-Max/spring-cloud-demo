package com.zztr.springbootdemo.vo;

/**
 * @author LiZanhong
 */
public class Result {
    private boolean success;
    private String message;

    public Result() {
        this.success = true;
    }

    public Result(String message) {
        this.success = false;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
