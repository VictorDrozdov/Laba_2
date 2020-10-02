package org.drozdov.Laba__2.implement;

import org.drozdov.Laba__2.inetrface.Receiver;
import org.springframework.stereotype.Component;

@Component
public class ReceiverImpl implements Receiver {
    @Override
    public String getMessage(String message) {
        return message;
    }
}
