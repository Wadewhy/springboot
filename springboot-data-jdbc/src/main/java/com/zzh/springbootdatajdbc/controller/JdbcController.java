package com.zzh.springbootdatajdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @PACKAGE_NAME: com.zzh.springbootdatajdbc.controller
 * @NAME: JdbcController
 * @Author: 钟子豪
 * @DATE: 2019/12/25
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 25
 * @DAY_NAME_FULL: 星期三
 * @PROJECT_NAME: springboot
 **/
@RestController
public class JdbcController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @GetMapping("/query")
    public Map<String,Object> map(){
        List<Map<String,Object>> list =jdbcTemplate.queryForList("select *from user");
        return list.get(1);
    }
}
