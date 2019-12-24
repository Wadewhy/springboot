/*
package com.zzh.springbootwebservletfilterlistener.config;

import com.zzh.springbootwebservletfilterlistener.filter.MyFilter;
import com.zzh.springbootwebservletfilterlistener.listenner.MyListener;
import com.zzh.springbootwebservletfilterlistener.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;

*/
/**
 * @PACKAGE_NAME: com.zzh.springbootwebservletfilterlistener.config
 * @NAME: WebCoreConfig
 * @Author: 钟子豪
 * @DATE: 2019/12/24
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 24
 * @DAY_NAME_FULL: 星期二
 * @PROJECT_NAME: springboot
 **//*

@Configuration
public class WebCoreConfig {
    @Bean
    public ServletRegistrationBean myServlet(){
        return new ServletRegistrationBean<>(new MyServlet());
    }
    @Bean
    public FilterRegistrationBean myFilter(){
        return new FilterRegistrationBean<>(new MyFilter());
    }
    @Bean
    public ServletListenerRegistrationBean myListener(){
        return new ServletListenerRegistrationBean<>(new MyListener());
    }
}
*/
