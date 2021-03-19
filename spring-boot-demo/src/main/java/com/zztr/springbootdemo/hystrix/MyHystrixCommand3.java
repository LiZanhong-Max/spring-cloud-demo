package com.zztr.springbootdemo.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class MyHystrixCommand3 extends HystrixCommand<String> {

    private final String name;

    protected MyHystrixCommand3(String name) {
        super(HystrixCommand.Setter.withGroupKey(
                HystrixCommandGroupKey.Factory.asKey("MyGroup"))
                .andCommandPropertiesDefaults(HystrixCommandProperties.Setter()
                .withExecutionIsolationStrategy(
                        HystrixCommandProperties.ExecutionIsolationStrategy.THREAD)));
        this.name = name;
    }

    @Override
    protected String run() {
        return this.name + ":" + Thread.currentThread().getName();
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<String> future = new MyHystrixCommand3("Lizanhong").queue();
        System.out.println(future.get());
    }
}
