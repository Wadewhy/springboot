package com.zzh.springbootproperties;


import com.zzh.springbootproperties.pojo.Person;
import com.zzh.springbootproperties.pojo.PersonSource;
import com.zzh.springbootproperties.pojo.User;
import com.zzh.springbootproperties.utils.PersonValue;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;


/**
 * @Author 钟子豪
 * @Date 2019/12/20
 * @description 嵌入式服务器由随机端口启动webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
 * 并且在运行时发现实际端口@LocalServerPort
 * @Return
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloApplicationTestBySpringBoot {

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setup() throws Exception {
        this.base = new URL("http://localhost:" + port + "/");
    }

    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> response = template.getForEntity(base.toString(), String.class);
        assert (response.getBody().equals("Greetings from Spring Boot!"));
    }

    @Autowired
    User user;

    @Test
    public void testConfigurationProperties() {
        System.out.println(user);
    }

    @Autowired
    private Person person;
    @Autowired
    private PersonValue personValue;
    @Autowired
    private PersonSource personSource;
    /**
     * 测试@ConfigurationProperties
     */
    @Test
    public void testPerson() {
        System.out.println(person);
    }
    @Test
    public void testPersonSource() {
        System.out.println(personSource);
    }

    /**
     * 测试@Value 引入配置值
     */
    @Test
    public void testPersonValue() {
        System.out.println(personValue);
    }
}
