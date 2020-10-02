package org.drozdov.Laba__2.controller;

import org.drozdov.Laba__2.implement.JavaConfig;

import org.drozdov.Laba__2.inetrface.Sender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@RestController
public class HomeController {

    private org.springframework.context.annotation.AnnotationConfigApplicationContext context;


    @RequestMapping(value = "/")
    public String home(){
        context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Sender sender = context.getBean("sender",Sender.class);
        return sender.sendMessage("Message from Java config");
    }
}

