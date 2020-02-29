package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailTests {

    @Autowired
    private MailClient mailClient;

    // thymeleaf模板引擎类
    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testTextMail() {
        mailClient.sendMail("731276899@qq.com", "TEST", "Welcome");
    }

    @Test
    public void testHtmlMail() {
        // 构造模板参数
        Context context = new Context();
        context.setVariable("username", "sunday");

        // 调用模板引擎生成动态网页
        String content = templateEngine.process("/mail/demo", context);
        System.out.println(content);

        // 发送HTML邮件
        mailClient.sendMail("Xiecz0513@outlook.com", "HTML", content);
    }
}
