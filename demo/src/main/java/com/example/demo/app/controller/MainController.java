package com.example.demo.app.controller;

import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.internet.MimeMessage;


@RestController
public class MainController {

    @Autowired
    private JavaMailSender mailSender;

    @RequestMapping(value="/hello")
    public String hello(){
        return "Hello World";
    }

    @Value("${email.add}")
    public String emailAdd;


    @RequestMapping(value="/sendMail")
    public String sendMail(){
        try {
            MimeMessage message = this.mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setTo(emailAdd);
//        helper.setSubject("SDPG User setup password.");
            helper.setSubject("Test");

            helper.setText("Test", true);

            this.mailSender.send(message);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Send Mail";
    }
}
