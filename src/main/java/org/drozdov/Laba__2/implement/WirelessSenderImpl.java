package org.drozdov.Laba__2.implement;

import org.drozdov.Laba__2.inetrface.Receiver;
import org.drozdov.Laba__2.inetrface.Sender;

public class WirelessSenderImpl implements Sender {
    private final Receiver receiver;
    public WirelessSenderImpl(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public String sendMessage(String message) {
        return receiver.getMessage("Wireless data transmissiom: " + message);
    }
}
