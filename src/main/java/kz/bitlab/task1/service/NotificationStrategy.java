package kz.bitlab.task1.service;

import kz.bitlab.task1.model.User;

public interface NotificationStrategy {

    void sendMessage(String message, User user);

}
