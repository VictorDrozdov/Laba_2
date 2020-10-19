package org.drozdov.Laba__2.controller;

import jakarta.validation.Valid;
import org.drozdov.Laba__2.entity.User;
import org.drozdov.Laba__2.implement.JavaConfig;

import org.drozdov.Laba__2.inetrface.Sender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.naming.Binding;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
public class HomeController {

    private org.springframework.context.annotation.AnnotationConfigApplicationContext context;
    private Collection<User> users = new ArrayList<>();


        @RequestMapping(value = "/{name}")
        public String home(@PathVariable("name") String name, Model model){
            context = new AnnotationConfigApplicationContext(JavaConfig.class);
            Sender sender = context.getBean("wirelessSenderImpl",Sender.class);
            model.addAttribute("msg",sender.sendMessage("Hello "+name+"!"));
            return "test";
        }
        @RequestMapping(value = "/users")
        public String getUsers(Model model){

            model.addAttribute("users",users);
            return "users";
        }
        @GetMapping(value = "/")
        public String getSignUp(Model model){
            model.addAttribute("user", new User());
            return "sign_up";
        }
        @PostMapping(value = "/")
        public String getSignUp(@ModelAttribute @Valid User user, BindingResult result){
            if(result.hasErrors()){
                return "sign_up";
            }
            users.add(user);
            return "redirect:/users";

        }
    }


