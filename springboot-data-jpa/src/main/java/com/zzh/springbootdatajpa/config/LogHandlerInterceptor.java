package com.zzh.springbootdatajpa.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @PACKAGE_NAME: com.zzh.springbootwebinterceptor.config
 * @NAME: LogHandlerInterceptor
 * @Author: 钟子豪
 * @DATE: 2019/12/24
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 24
 * @DAY_NAME_FULL: 星期二
 * @PROJECT_NAME: springboot
 * 拦截器
 **/
//不想每次都写private  final Logger logger = LoggerFactory.getLogger(当前类名.class); 可以用注解@Slf4j;
@Slf4j
public class LogHandlerInterceptor implements HandlerInterceptor {
    /**
     * 请求方法执行前执行此方法
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        StringBuffer requestURL = request.getRequestURL();
        log.info("perHandle拦截请求URL："+requestURL.toString());
        return true;
    }

    /**
     * 返回modelAndView之前执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("postHandle返回modelAndView之前执行");
    }

    /**
     * 执行Handler完成执行此方法
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("afterCompletion执行完请求方法完全返回之后");
    }
}
