package org.drozdov.Laba__2.implement;

import org.drozdov.Laba__2.inetrface.Receiver;
import org.drozdov.Laba__2.inetrface.Sender;

public class SenderImpl implements Sender {
    private final Receiver receiver;
    public SenderImpl(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public String sendMessage(String message) {
        return receiver.getMessage("Wired data transmissiom:" + message);
    }
}
