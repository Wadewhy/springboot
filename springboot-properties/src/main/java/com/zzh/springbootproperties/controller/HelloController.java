package com.zzh.springbootproperties.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 钟子豪
 * @Date 2019/12/21
 * @description 
 No such property: code for class: Script1
 * @Return 
 */
@Slf4j
@RestController
public class HelloController {

    @Value("${bootapp.description}")
    private String description;

    @RequestMapping("/")
    public String index() {
        log.info(description);
        return "Greetings from Spring Boot!";
    }

}
