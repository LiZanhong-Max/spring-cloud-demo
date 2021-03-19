package com.zztr.springbootdemo.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

import java.util.concurrent.ExecutionException;

public class MyHystrixCommand2 extends HystrixCommand<String> {

    private final String name;

    protected MyHystrixCommand2(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("MyGroup"));
        this.name = name;
    }

    @Override
    protected String run() {
        try {
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.name + ":" + Thread.currentThread().getName();
    }

    @Override
    protected String getFallback() {
        return "失败了";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String result = new MyHystrixCommand("LiZanhong").execute();
        System.out.println(result);
    }
}
