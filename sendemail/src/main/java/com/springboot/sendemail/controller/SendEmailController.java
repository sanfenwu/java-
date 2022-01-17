package com.springboot.sendemail.controller;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Decoder;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: sanfenwu
 * @Date: 2021/12/29 0029
 */
@RestController
public class SendEmailController {
    @Resource
    JavaMailSender jms;
    @RequestMapping(value = "/test",method = RequestMethod .POST)
    public  void main() throws IOException {
        String strP7Data = "MIICzwYJKoZIhvcNAQcCoIICwDCCArwCAQExCzAJBgUrDgMCGgUAMBIGCSqGSIb3DQEHAaAFBAMxMjOgggHBMIIBvTCCASagAwIBAgIEq83vEjANBgkqhkiG9w0BAQUFADAjMSEwHwYDVQQDFBhaSENTLUFCQzAwMDFfbXlfa2V5X3BhaXIwHhcNMjExMDE0MDQ1MjQxWhcNMzYxMDEwMDQ1MjQxWjAjMSEwHwYDVQQDFBhaSENTLUFCQzAwMDFfbXlfa2V5X3BhaXIwgZ8wDQYJKoZIhvcNAQEBBQADgY0AMIGJAoGBANcJuY1ULeJJL9yqVtc/wAGMn5Ca2HhoF70ZhPXXI2mjQx/NvsJUWW7GRWix8jom/B/D5LixwsG1Vrpn8aK+WdQQ4eRep3YDw5d3Vj0DgwgglPbtprLUHpvpqZKYR7s8iyLqRo52HX37p9fhxf5GXlOK8R0ncz+g8Nroq79ccrcXAgMBAAEwDQYJKoZIhvcNAQEFBQADgYEAHD4cjn2BSXIgSxDuULfIWsKmphq0rNcAHq/sFnBELZHQgXkQl6PP5h7Ku04j6uLVJN6HYBKn5CtOBxas3bv0RMPBqaXUPgroIr/Gj+f5HmhyD1Qs1QXu/9piCqQVoaDeUgFhWysmG7KhKNWdE33Z/OtdDCfBcLD/K1zigFgHK9sxgdAwgc0CAQEwKzAjMSEwHwYDVQQDFBhaSENTLUFCQzAwMDFfbXlfa2V5X3BhaXICBKvN7xIwCQYFKw4DAhoFADANBgkqhkiG9w0BAQEFAASBgNLaAka2FrUEm/aTb5p/R5oYRkh2WppVljpUW5GcumwQzmhn078lJRGZUZ71ansdPFaEZLUsCBb7u+l5fBnSPZItAm05D6ihtn/M8oL8V4pWcvqeP2hL0LDsIM5IV8ZKWzKo0uqSJdaYMyLo2YYHA7J6uxOFDgQ1xFbFcV/elIPa";
        BASE64Decoder base64Decoder = new BASE64Decoder();
        String gbk = new String(strP7Data.getBytes(), "GBK");
        byte[] decode = Base64Utils.decode(gbk.getBytes());
new ArrayList();
new HashMap<>();
new LinkedHashSet();
new ConcurrentHashMap();
        CompletableFuture();
        jms.createMimeMessage();
        MimeMessage message=jms.createMimeMessage();
        try {
            MimeMessageHelper helper=new MimeMessageHelper(message,true);
            helper.setFrom("1176074793@qq.com");
            helper.setTo("18369655060@163.com");
            helper.setSubject("测试邮件");
            helper.setText("这是内容");
            //验证文件数据是否为空
           // helper.addAttachment();
            helper.addAttachment("IMG_3376.PKG",new File("F:/IMG_3376.JPG"));
            jms.send(message);
            System.out.println("带附件的邮件发送成功");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("发送带附件的邮件失败");
        }
    }
}
