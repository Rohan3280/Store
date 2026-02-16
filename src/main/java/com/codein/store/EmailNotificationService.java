package com.codein.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service

public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Message Sent via email ! : ");
        System.out.println(message);
    }
}
