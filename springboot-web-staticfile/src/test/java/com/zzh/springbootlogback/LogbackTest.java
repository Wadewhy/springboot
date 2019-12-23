package com.zzh.springbootlogback;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @PACKAGE_NAME: com.zzh.springbootlogback
 * @NAME: LogbackTest
 * @Author: 钟子豪
 * @DATE: 2019/12/21
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 21
 * @DAY_NAME_FULL: 星期六
 * @PROJECT_NAME: springboot
 **/

/**
 * @RunWith就是一个运行器
 * @RunWith(JUnit4.class)就是指用JUnit4来运行
 * @RunWith(SpringJUnit4ClassRunner.class),让测试运行于Spring测试环境
 * @RunWith(Suite.class)的话就是一套测试集合，
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LogbackTest {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testLog(){
        logger.trace("Trace 日志...");
        logger.debug("Debug 日志...");
        logger.info("Info 日志...");
        logger.warn("Warn 日志...");
        logger.error("Error 日志...");
    }

}
