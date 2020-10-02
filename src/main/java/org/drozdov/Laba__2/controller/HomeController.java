package org.drozdov.Laba__2.controller;

import org.drozdov.Laba__2.implement.ReceiverImpl;
import org.drozdov.Laba__2.implement.SenderImpl;
import org.drozdov.Laba__2.implement.WirelessSenderImpl;
import org.drozdov.Laba__2.inetrface.Receiver;
import org.drozdov.Laba__2.inetrface.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private org.springframework.web.context.WebApplicationContext context;


    @RequestMapping(value = "/")
    public String home(){
        Sender sender = context.getBean("sender",Sender.class);
        return sender.sendMessage("My Message");
    }
}

