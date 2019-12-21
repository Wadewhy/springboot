package com.zzh.springbootproperties.utils;

import com.zzh.springbootproperties.pojo.Dog;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @PACKAGE_NAME: com.zzh.springboothello.utils
 * @NAME: PersonValue
 * @Author: 钟子豪
 * @DATE: 2019/12/20
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 20
 * @DAY_NAME_FULL: 星期五
 * @PROJECT_NAME: springboot
 **/
@Data
@Component
@Validated
public class PersonValue {

    /**
     * 直接从配置文件读取一个值
     */
    @Value("${person.last-name}")
    private String lastName;

    /**
     * 支持SpEL表达式
     */
    @Value("#{11*4/2}")
    private Integer age;

    @Value("${person.birth}")
    private Date birth;

    /**
     * 不支持复杂类型
     */
    private Map<String, String> maps;
    private List<String> lists;
    private Dog dog;

    /**
     * 不支持数据校验
     */
    @Email
    @Value("xxx@@@@")
    private String email;
}
