package com.zztr.yf2021springboot.utils;

import com.zztr.yf2021springboot.vo.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHander {
    @ExceptionHandler
    @ResponseBody
    public Result defaultErrorHander(Exception e) throws Exception{
        Result result = new Result();
        if(e instanceof NoHandlerFoundException){
            result.setCode(404);
        }else{
            result.setCode(500);
        }
        result.setStatus(false);
        result.setMessage(e.getMessage());
        result.setData(null);
        return result;
    }
}
