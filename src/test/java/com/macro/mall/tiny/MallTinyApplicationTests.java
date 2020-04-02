package com.macro.mall.tiny;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallTinyApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    public void contextLoads() {

        //邮件发送
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject("test");
        mailMessage.setText("test");
        mailMessage.setTo("123@123");
        mailMessage.setFrom("123@123");
        mailSender.send(mailMessage);
    }

}
