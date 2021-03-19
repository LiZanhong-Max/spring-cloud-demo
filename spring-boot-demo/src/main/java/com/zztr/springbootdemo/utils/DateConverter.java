package com.zztr.springbootdemo.utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        return java.sql.Timestamp.valueOf(s);
    }
}
