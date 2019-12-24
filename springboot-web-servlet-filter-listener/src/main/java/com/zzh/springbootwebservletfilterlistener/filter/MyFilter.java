package com.zzh.springbootwebservletfilterlistener.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @PACKAGE_NAME: com.zzh.springbootwebservletfilterlistener.filter
 * @NAME: MyFilter
 * @Author: 钟子豪
 * @DATE: 2019/12/24
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 24
 * @DAY_NAME_FULL: 星期二
 * @PROJECT_NAME: springboot
 **/
@Slf4j
@WebFilter(urlPatterns = "/*")
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("拦截器开始拦截");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
