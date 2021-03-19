package com.zztr.pptzzul.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

public class PreFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 2;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("执行pre过滤器逻辑");
        RequestContext cx = RequestContext.getCurrentContext();
        cx.setSendZuulResponse(false);//服务不再调用，但后面的过滤器还是会继续执行
        cx.setResponseBody("请求被拦截");
        cx.getResponse().setContentType("text/html;charset=utf-8");//处理中文乱码
        return null;
    }
}
