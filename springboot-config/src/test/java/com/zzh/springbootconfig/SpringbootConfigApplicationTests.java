package com.zzh.springbootconfig;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class SpringbootConfigApplicationTests {

    @Autowired
    private ApplicationContext context;
    @Test
    public void testSpringIOC(){
        boolean helloService = context.containsBean("helloService");
        System.out.println(helloService);
    }
    @Test
    void contextLoads() {
    }

}
