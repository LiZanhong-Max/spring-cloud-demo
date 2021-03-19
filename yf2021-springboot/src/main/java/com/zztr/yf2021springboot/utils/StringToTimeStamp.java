package com.zztr.yf2021springboot.utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;

@Component
public class StringToTimeStamp
        implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        return Timestamp.valueOf(s);
    }
}
