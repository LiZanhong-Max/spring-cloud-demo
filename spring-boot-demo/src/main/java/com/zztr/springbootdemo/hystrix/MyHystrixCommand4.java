package com.zztr.springbootdemo.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class MyHystrixCommand4 extends HystrixCommand<String> {

    private final String name;

    protected MyHystrixCommand4(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("MyGroup"));
        this.name = name;
    }

    @Override
    protected String run() {
        System.out.println("get data");
        return this.name + ":" + Thread.currentThread().getName();
    }

    @Override
    protected String getCacheKey() {
        return String.valueOf(this.name);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        HystrixRequestContext context = HystrixRequestContext.initializeContext();
        String result = new MyHystrixCommand4("Lizanhong").execute();
        System.out.println(result);
        result = new MyHystrixCommand4("Lizanhong").execute();
        System.out.println(result);
        Future<String> future = new MyHystrixCommand4("Lizanhong").queue();
        System.out.println(future.get());
        context.shutdown();
    }
}
