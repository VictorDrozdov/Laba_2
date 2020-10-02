package org.drozdov.Laba__2.controller;

import org.drozdov.Laba__2.implement.ReceiverImpl;
import org.drozdov.Laba__2.implement.SenderImpl;
import org.drozdov.Laba__2.implement.WirelessSenderImpl;
import org.drozdov.Laba__2.inetrface.Receiver;
import org.drozdov.Laba__2.inetrface.Sender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final Sender sender;
    private final Receiver receiver;

    public HomeController() {
        this.receiver = new ReceiverImpl();
        this.sender = new WirelessSenderImpl(receiver);
    }
    @RequestMapping(value = "/")
    public String home(){
        return sender.sendMessage("Hello world");
    }
}

