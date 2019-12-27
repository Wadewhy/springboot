package com.zzh.springbootmail.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Map;

/**
 * @PACKAGE_NAME: com.zzh.springbootmail.service
 * @NAME: MailService
 * @Author: 钟子豪
 * @DATE: 2019/12/27
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 27
 * @DAY_NAME_FULL: 星期五
 * @PROJECT_NAME: springboot
 * 邮箱服务
 **/
@Service
@Slf4j
public class MailService {
    @Value("${spring.mail.username}")
    private String mailname;
    //发邮件工具类
    @Autowired
    private JavaMailSender mailSender;


    public void sayHello() {
        System.out.println("Hello world");
    }

    /**
     * 发送简单的文本邮件
     *
     * @param to
     * @param subject
     * @param content
     */
    public void sendSimpleTextMail(String to, String subject, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
        message.setFrom(mailname);
        mailSender.send(message);
        log.info("【文本邮件】发送成功！！！To={}" + to);
    }

    /**
     * 用于测试发送HTML邮件
     *
     * @param to
     * @param subject
     * @param content
     */
    public void sendHtmlMail(String to, String subject, String content) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        //也就是说,如果要支持内联元素和附件就必须给定第二个参数为true
        // 否则抛出 java.lang.IllegalStateException 异常
        MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
        //设置发件人Email
        messageHelper.setFrom(mailname);
        //设定收件人Email
        messageHelper.setTo(to);
        //设置邮件主题
        messageHelper.setSubject(subject);
        //设置邮件主题内容(html格式)
        messageHelper.setText(content, true);
        //添加附件
//        messageHelper.addAttachment(file.getFilename(), file);
        mailSender.send(message);
        log.info("【HTML 邮件】成功发送！to={}", to);
    }

    /**
     * 发送附带邮件
     *
     * @param to
     * @param subject
     * @param content
     * @param fileArr
     */
    public void sendAttachmentMail(String to, String subject, String content, String... fileArr) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
        messageHelper.setFrom(mailname);
        messageHelper.setTo(to);
        messageHelper.setSubject(subject);
        messageHelper.setText(content, true);
        //添加附件
        for (String filePath : fileArr
        ) {
            FileSystemResource fileSystemResource = new FileSystemResource(new File(filePath));
            if (fileSystemResource.exists()) {
                //得到文件名
                String filename = fileSystemResource.getFilename();
                /**
                 * MimeMessageHelper的addAttachment方法：
                 * addAttachment(String attachmentFilename, InputStreamSource inputStreamSource)
                 * InputStreamSource是一个接口,ClassPathResource和FileSystemResource都实现了这个接口
                 */
                messageHelper.addAttachment(filename, fileSystemResource);
            }
            mailSender.send(mimeMessage);
            log.info("【附件邮件】成功发送！to={}", to);
        }
    }

    /**
     * 邮件添加图片
     * @param to
     * @param subject
     * @param content
     * @param imgMap
     * @throws MessagingException
     */
    public void sendImgMail(String to, String subject, String content, Map<String, String> imgMap) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
        messageHelper.setFrom(mailname);
        messageHelper.setTo(to);
        messageHelper.setSubject(subject);
        messageHelper.setText(content, true);
        //添加图片
        for (Map.Entry<String,String> entry: imgMap.entrySet()
             ) {
            FileSystemResource fileSystemResource =new FileSystemResource(new File(entry.getValue()));
            if (fileSystemResource.exists()) {
                String filename = fileSystemResource.getFilename();
                //添加图片
                messageHelper.addInline(entry.getKey(),fileSystemResource);
            }
        }
        mailSender.send(mimeMessage);
        log.info("【图片邮件】成功发送！to={}", to);
    }


    @Autowired
    private TemplateEngine templateEngine;
    /**
     * 发送模版邮件
     *
     * @param to
     * @param subject
     * @param paramMap
     * @param template
     * @throws MessagingException
     */
    public void sendTemplateMail(String to, String subject, Map<String, Object> paramMap, String template)
            throws MessagingException {
        System.err.println(template);
        Context context = new Context();
        context.setVariables(paramMap);
        String emailContent = templateEngine.process(template, context);
        sendHtmlMail(to, subject, emailContent);
        log.info("【模版邮件】成功发送！paramsMap={}，template={}", paramMap, template);
    }
}
