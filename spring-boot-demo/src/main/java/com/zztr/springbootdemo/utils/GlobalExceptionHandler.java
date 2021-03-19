package com.zztr.springbootdemo.utils;

import com.zztr.springbootdemo.vo2.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result defaultErrorHandler(Exception e) throws Exception{
        System.out.println("defaultErrorHandler");
        Result result = new Result();
        result.setMessage(e.getMessage());
        if(e instanceof NoHandlerFoundException){
            result.setCode(404);
        }else{
            result.setCode(500);
        }
        result.setData(null);
        result.setStatus(false);
        return result;
    }
}
