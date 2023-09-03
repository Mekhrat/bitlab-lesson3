package kz.bitlab.task1.service.impl;

import kz.bitlab.task1.model.User;
import kz.bitlab.task1.service.LoggerService;
import kz.bitlab.task1.service.Notification;
import org.springframework.stereotype.Service;


public class SMSNotification implements Notification {

    @Override
    public void send(String message ,User user) {
        LoggerService.info("Message sent successfully to {}", user.getPhone());
    }
}
