package org.drozdov.Laba__2.implement;

import org.drozdov.Laba__2.inetrface.Receiver;
import org.drozdov.Laba__2.inetrface.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WirelessSenderImpl implements Sender {
    private final Receiver receiver;
    @Autowired
    public WirelessSenderImpl(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public String sendMessage(String message) {
        return receiver.getMessage("Wireless data transmissiom: " + message);
    }
}
