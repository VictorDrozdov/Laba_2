package org.drozdov.Laba__2.controller;

import org.drozdov.Laba__2.implement.JavaConfig;

import org.drozdov.Laba__2.inetrface.Sender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private org.springframework.context.annotation.AnnotationConfigApplicationContext context;



        @RequestMapping(value = "/{name}")
        public String home(@PathVariable("name") String name, Model model){
            context = new AnnotationConfigApplicationContext(JavaConfig.class);
            Sender sender = context.getBean("wirelessSenderImpl",Sender.class);
            model.addAttribute("msg",sender.sendMessage("Hello "+name+"!"));
            return "test";
        }
    }


