package com.zzh.springbootdatajpa.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @PACKAGE_NAME: com.zzh.springbootwebstaticfile.pojo
 * @NAME: Person
 * @Author: 钟子豪
 * @DATE: 2019/12/22
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 22
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: springboot
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    /**
     * 用户名
     */
    private String username;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 技能
     */
    private List<String> skills;
}
