package com.zzh.springbootwebservletfilterlistener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
/**
 * @ServletComponentScan 扫描Servlet,Filter,Listener 添加到容器
 */
@SpringBootApplication
@ServletComponentScan
public class SpringbootWebServletFilterListenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebServletFilterListenerApplication.class, args);
    }

}
