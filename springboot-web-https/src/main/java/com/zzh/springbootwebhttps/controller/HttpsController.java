package com.zzh.springbootwebhttps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME: com.zzh.springbootwebhttps.controller
 * @NAME: HttpsController
 * @Author: 钟子豪
 * @DATE: 2019/12/28
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 28
 * @DAY_NAME_FULL: 星期六
 * @PROJECT_NAME: springboot
 **/
@RestController
public class HttpsController {
    @GetMapping(value="/hello")
    public String hello(){
        return "Hello HTTPS_TEST";
    }
}
