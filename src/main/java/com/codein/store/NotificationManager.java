package com.codein.store;

import org.springframework.stereotype.Service;

@Service
public class NotificationManager {

    private final NotificationService notificationService;
    public NotificationManager(NotificationService notificationService)
    {
        this.notificationService=notificationService;
    }
    public void sendNotification(String Message,String recipientEmail)
    {
        notificationService.send(Message,recipientEmail);
    }

}
