package com.zzh.springbootweberror;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootWebErrorApplicationTests {

    @Test
   public void contextLoads() {
    }
    @Test
    public void error(){
        System.err.println("errorTest");
        int[] a={0,1,2};
    }

}
