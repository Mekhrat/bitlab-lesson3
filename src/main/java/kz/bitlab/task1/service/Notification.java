package kz.bitlab.task1.service;

import kz.bitlab.task1.model.User;

public interface Notification {

    void send(String message, User user);
}
