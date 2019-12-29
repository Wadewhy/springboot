package com.zzh.springbootdatamybatispage.util;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @PACKAGE_NAME: com.zzh.springbootdatamybatis.util
 * @NAME: MybatisGenerator
 * @Author: 钟子豪
 * @DATE: 2019/12/26
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 26
 * @DAY_NAME_FULL: 星期四
 * @PROJECT_NAME: springboot
 * Mybatis generator的逆向生成工具类
 **/
@Service
public class MybatisGenerator {
    public void generator() throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        ArrayList<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        //指定逆向工程配置文件
        File configFile = new File("F:\\MyIdeaProgram\\SpringBoot\\springboot\\springboot-data-mybatis-page\\c1.xml");
        System.err.println(configFile.getAbsolutePath());
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    public static void main(String[] args) throws Exception {
        MybatisGenerator mybatisGenerator = new MybatisGenerator();
        mybatisGenerator.generator();

    }

}
