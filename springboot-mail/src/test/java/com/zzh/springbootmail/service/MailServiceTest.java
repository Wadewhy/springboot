package com.zzh.springbootmail.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import java.util.HashMap;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {
    @Autowired
    private MailService mailService;


    @Test
    public void sendSimpleTextMailTest() {
        String to = "wadewhy@yeah.net";
        String subject = "Springboot 测试发送简单文本邮件";
        String content = "<p>第一封 Springboot 简单文本邮件</p>";
        mailService.sendSimpleTextMail(to, subject, content);
    }

    /**
     * 解析HTML
     *
     * @throws MessagingException
     */
    @Test
    public void sendHtmlMailTest() throws MessagingException {
        String to = "wadewhy@yeah.net";
        String subject = "Springboot 发送 HTML 邮件";
        String content = "<h2>Hi~</h2><p>第一封 Springboot HTML 邮件</p>";
        mailService.sendHtmlMail(to, subject, content);
    }

    /**
     * 附带文件
     *
     * @throws MessagingException
     */
    @Test
    public void sendAttachmentTest() throws MessagingException {
        String to = "wadewhy@yeah.net";
        String subject = "Springboot 发送 HTML 附件邮件";
        String content = "<h2>Hi~</h2><p>第一封 Springboot HTML 附件邮件</p>";
        String filePath = "pom.xml";
        mailService.sendAttachmentMail(to, subject, content, filePath, filePath);
    }

    /**
     * 测试邮件加图片
     *
     * @throws MessagingException
     */
    @Test
    public void sendImgTest() throws MessagingException {
        String to = "wadewhy@yeah.net";
        String subject = "Springboot 发送 HTML 图片邮件";
        String content =
                "<h2>Hi~</h2><p>第一封 Springboot HTML 图片邮件</p><br/><img src=\"cid:img01\" /><img src=\"cid:img02\" />";
        String imgPath = "a.png";
        Map<String, String> imgMap = new HashMap<>();
        imgMap.put("img01", imgPath);
        imgMap.put("img02", imgPath);
        mailService.sendImgMail(to, subject, content, imgMap);
    }
    //模板引擎
    @Autowired
    private TemplateEngine templateEngine;
    /**
     * 模板
     */
    @Test
    public void sendTemplateMailTest() throws MessagingException {
        String to = "wadewhy@yeah.net";
        String subject = "Springboot 发送 模版邮件";
        Map<String, Object> paramMap = new HashMap();
        paramMap.put("username", "wadewhy");
        mailService.sendTemplateMail(to, subject, paramMap, "RegisterSuccess");
        paramMap.put("username", "wadewhy");
        mailService.sendTemplateMail(to, subject, paramMap, "ce");
    }
    @Test
    public void templateTest() {
        Context context = new Context();
        Map<String, Object> paramMap = new HashMap();
        paramMap.put("username", "niumoo");
        context.setVariables(paramMap);
        String emailContent = templateEngine.process("RegisterSuccess", context);
        System.out.println(emailContent);
    }
    @Test
    public void templateTest1() {
        Context context = new Context();
        Map<String, Object> paramMap = new HashMap();
        paramMap.put("username", "niumoo");
        context.setVariables(paramMap);
        String emailContent = templateEngine.process("ce", context);
        System.out.println(emailContent);
    }

}