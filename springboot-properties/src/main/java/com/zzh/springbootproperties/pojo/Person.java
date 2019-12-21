package com.zzh.springbootproperties.pojo;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @PACKAGE_NAME: com.zzh.springboothello.pojo
 * @NAME: Person
 * @Author: 钟子豪
 * @DATE: 2019/12/20
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 20
 * @DAY_NAME_FULL: 星期五
 * @PROJECT_NAME: springboot
 **/

@Data
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
    private String lastName;
    private Integer age;
    private Date birth;
    private Map<String, String> maps;
    private List<String> lists;
    private Dog dog;
    /**
     * 支持数据校验
     */
    @Email
    private String email;

}
