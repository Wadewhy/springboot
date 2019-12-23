package com.zzh.springbootwebstaticfile.controller;

import com.zzh.springbootwebstaticfile.pojo.Person;
import com.zzh.springbootwebstaticfile.pojo.Response;
import com.zzh.springbootwebstaticfile.util.ResponseUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

/**
 * @PACKAGE_NAME: com.zzh.springbootwebstaticfile.controller
 * @NAME: PersonController
 * @Author: 钟子豪
 * @DATE: 2019/12/22
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 22
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: springboot
 **/
@RestController
public class PersonController {
    @GetMapping(value="/person")
    public Response getPerson(){
        Person person = new Person("wadewhy",21,new Date(), Arrays.asList("java","sql","css"));
        return ResponseUtil.success(person);
    }
}
