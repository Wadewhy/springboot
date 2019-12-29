package xyz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author 钟子豪
 * @Date 2019/12/29
 * @description 
 No such property: code for class: Script1
 * @Return 
 */
@SpringBootApplication(scanBasePackages = "xyz.wadewhy")
@MapperScan("xyz.wadewhy.model")
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
