package kz.bitlab.task1.service.impl;

import kz.bitlab.task1.service.Notification;
import kz.bitlab.task1.service.NotificationFactory;

public class EmailNotificationFactory implements NotificationFactory {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
