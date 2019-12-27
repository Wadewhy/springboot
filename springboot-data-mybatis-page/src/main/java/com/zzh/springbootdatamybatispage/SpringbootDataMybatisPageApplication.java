package com.zzh.springbootdatamybatispage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@tk.mybatis.spring.annotation.MapperScan(basePackages="com.zzh.springbootdatamybatispage.dao")
public class SpringbootDataMybatisPageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDataMybatisPageApplication.class, args);
    }

}
