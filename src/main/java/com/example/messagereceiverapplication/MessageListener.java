package com.example.messagereceiverapplication;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @JmsListener(destination = "detailsQueue")
    public void receiveMessage(String message) {
        System.out.println("Message received: " + message);
    }
}