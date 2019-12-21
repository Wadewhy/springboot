package com.zzh.springbootproperties.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PACKAGE_NAME: com.zzh.springboothello.pojo
 * @NAME: Dog
 * @Author: 钟子豪
 * @DATE: 2019/12/20
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 20
 * @DAY_NAME_FULL: 星期五
 * @PROJECT_NAME: springboot
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dog {
    private String name;
    private String age;
}
