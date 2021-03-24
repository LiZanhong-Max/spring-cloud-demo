package com.zztr.yf2021invoke.controller.utils;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

import java.util.List;

public class MyRule implements IRule {
    private ILoadBalancer loadBalancer;

    @Override
    public Server choose(Object o) {
        List<Server> servers = loadBalancer.getAllServers();
        servers.forEach(s -> {
            System.out.println(s.getHostPort());
        });
        return servers.get(0);
    }

    @Override
    public void setLoadBalancer(ILoadBalancer iLoadBalancer) {
        this.loadBalancer = iLoadBalancer;
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return this.loadBalancer;
    }
}
