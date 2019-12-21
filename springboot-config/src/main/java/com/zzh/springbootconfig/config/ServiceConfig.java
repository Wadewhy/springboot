package com.zzh.springbootconfig.config;

import com.zzh.springbootconfig.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @PACKAGE_NAME: com.zzh.springbootconfig.config
 * @NAME: ServiceConfig
 * @Author: 钟子豪
 * @DATE: 2019/12/21
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 21
 * @DAY_NAME_FULL: 星期六
 * @PROJECT_NAME: springboot
 * 使用注解类，来得到bean
 **/
@Configuration
public class ServiceConfig {
    /**
     * 默认添加到容器中的ID为方法名helloService
     * @return
     */
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
