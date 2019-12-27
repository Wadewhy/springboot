package com.zzh.springbootdatamybatispage.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @PACKAGE_NAME: com.zzh.springbootdatajdbc.config
 * @NAME: DruidConfig
 * @Author: 钟子豪
 * @DATE: 2019/12/25
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 25
 * @DAY_NAME_FULL: 星期三
 * @PROJECT_NAME: springboot
 * 配置类
 **/
@Configuration
public class DruidConfig {
    /**
     * 配置绑定
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource druid(){
        return new DruidDataSource();
    }

    /**
     * Druid的管理后台的Servlet
     * Druid内置提供了一个StatViewServlet用于展示Druid的统计信息。
     * @return
     */
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean bean =new ServletRegistrationBean(new StatViewServlet());
        Map<String, String> initParams = new HashMap<>();
        initParams.put("loginUsername", "root");//后台登录用户
        initParams.put("loginPassword", "admin");//后台登录密码
        //initParas.put("allow","");//默认允许所有访问
        initParams.put("allow","127.0.0.1");//允许的ip
        bean.setInitParameters(initParams);
        bean.setUrlMappings(Arrays.asList("/druid/*"));
        return bean;
    }

    /**
     * 配置一个监控的filter
     * druid配置WebStatFilter完成网络url统计
     * @return
     */
    @Bean
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean<WebStatFilter> bean = new FilterRegistrationBean<>(new WebStatFilter());
        HashMap<String, String> initParams = new HashMap<>();
        initParams.put("exclusions", "/css,/druid/*");//哪些文件不进行过滤
        bean.setInitParameters(initParams);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }
}
