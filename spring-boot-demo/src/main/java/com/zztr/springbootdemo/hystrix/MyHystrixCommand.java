package com.zztr.springbootdemo.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class MyHystrixCommand extends HystrixCommand<String> {

    private final String name;

    protected MyHystrixCommand(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("MyGroup"));
        this.name = name;
    }

    @Override
    protected String run() {
        return this.name + ":" + Thread.currentThread().getName();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //String result = new MyHystrixCommand("LiZanhong").execute();
        Future<String> future = new MyHystrixCommand("Lizanhong").queue();
        System.out.println(future.get());
    }
}
