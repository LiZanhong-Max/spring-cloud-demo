package com.zztr.springbootdemo.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import com.netflix.hystrix.HystrixRequestCache;
import com.netflix.hystrix.strategy.concurrency.HystrixConcurrencyStrategyDefault;
import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class MyHystrixCommandClear extends HystrixCommand<String> {

    private final String name;

    private static final HystrixCommandKey KEY = HystrixCommandKey.Factory.asKey("MyKey");

    protected MyHystrixCommandClear(String name) {
        super(HystrixCommand.Setter.withGroupKey(
                HystrixCommandGroupKey.Factory.asKey("MyGroup"))
                .andCommandKey(KEY));
        this.name = name;
    }

    public static void flushCache(String name){
        HystrixRequestCache.getInstance(KEY, HystrixConcurrencyStrategyDefault.getInstance())
                .clear(name);
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
        String result = new MyHystrixCommandClear("Lizanhong").execute();
        System.out.println(result);
        flushCache("Lizanhong");
        result = new MyHystrixCommandClear("Lizanhong").execute();
        System.out.println(result);
        Future<String> future = new MyHystrixCommandClear("Lizanhong").queue();
        System.out.println(future.get());
        context.shutdown();
    }
}
