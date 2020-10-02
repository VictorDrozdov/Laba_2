package org.drozdov.Laba__2.implement;

import org.drozdov.Laba__2.inetrface.Receiver;
import org.drozdov.Laba__2.inetrface.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class JavaConfig {
    @Bean
    public Receiver receiver(){
        return new ReceiverImpl();
    }
    @Bean
    public Sender sender(@Autowired Receiver receiver){
        return new WirelessSenderImpl(receiver);
    }
}
