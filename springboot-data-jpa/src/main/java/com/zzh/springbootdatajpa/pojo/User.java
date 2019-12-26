package com.zzh.springbootdatajpa.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @PACKAGE_NAME: com.zzh.springbootwebtemplate.pojo
 * @NAME: User
 * @Author: 钟子豪
 * @DATE: 2019/12/23
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 23
 * @DAY_NAME_FULL: 星期一
 * @PROJECT_NAME: springboot
 * JPA实体
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {

    /**
     * 用户ID
     *
     * @Id 主键
     * @GeneratedValue 自增主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "username", length = 32, nullable = false)
    @NotNull(message = "用户名不能为空")
    private String username;
    /**
     * 密码
     */
    @Column(name = "password", length = 32, nullable = false)
    @NotNull(message = "密码不能为空")
    private String password;
    /**
     * 年龄
     */
    @Column(name = "age", length = 3)
    private Integer age;
    /**
     * 生日
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date birthday;
    /**
     * 技能
     */
    private String skills;
}
