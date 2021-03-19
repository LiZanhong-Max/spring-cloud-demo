package com.zztr.springbootdemo.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "a.b")
@Component
public class Config {
    private String c;
    private String d;

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Config{" +
                "c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }
}
