package kz.bitlab.task1.model;

import kz.bitlab.task1.service.LoggerService;
import kz.bitlab.task1.service.Notification;
import kz.bitlab.task1.service.NotificationFactory;
import kz.bitlab.task1.service.Observer;
import kz.bitlab.task1.service.impl.EmailNotification;
import kz.bitlab.task1.service.impl.EmailNotificationFactory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Observer {

    private String name;
    private String email;
    private String phone;

    @Override
    public void update(String message) {
        LoggerService.info("User {} has received message: {}", name, message);

        NotificationFactory notificationFactory = new EmailNotificationFactory();
        Notification notification = notificationFactory.createNotification();
        notification.send(message, this);
    }
}
