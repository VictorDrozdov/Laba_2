package org.drozdov.Laba__2.controller;
//import com.sun.tools.javac.util.List;
//import org.drozdov.Laba__2.*;
import  java.util.List;

import org.drozdov.Laba__2.entity.User;
import org.drozdov.Laba__2.implement.JavaConfig;
import org.drozdov.Laba__2.inetrface.Sender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;


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
    @RequestMapping(value = "/")
    public String getUser(Model model){
        Collection<User> users = List.of(
                new User("jon", "smit", "fjk@jkf.ru"),
                new User("mikle", "jonson", "dk@fj.ru")
        );
        model.addAttribute("users", users);
        return "users";

    }
}

