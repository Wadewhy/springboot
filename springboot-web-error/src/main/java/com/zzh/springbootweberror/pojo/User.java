
package com.zzh.springbootweberror.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @PACKAGE_NAME: com.zzh.springbootwebtemplate.pojo
 * @NAME: User
 * @Author: 钟子豪
 * @DATE: 2019/12/23
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 23
 * @DAY_NAME_FULL: 星期一
 * @PROJECT_NAME: springboot
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
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