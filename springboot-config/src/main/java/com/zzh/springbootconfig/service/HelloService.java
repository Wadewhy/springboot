package com.zzh.springbootconfig.service;

/**
 * @PACKAGE_NAME: com.zzh.springbootconfig.service
 * @NAME: HelloService
 * @Author: 钟子豪
 * @DATE: 2019/12/21
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 21
 * @DAY_NAME_FULL: 星期六
 * @PROJECT_NAME: springboot
 **/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 测试server bean的加载方式
 * 1.使用@Service注解声明
 * 2.使用XML配置通过@ImportResource 引入
 * 3.使用@Configuration结合@Bean的方式添加到容器
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloService {
    private String name;
    private Integer age;
}
