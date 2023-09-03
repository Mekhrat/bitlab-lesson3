package kz.bitlab.task1.service.impl;

import kz.bitlab.task1.service.Observer;
import kz.bitlab.task1.service.Subject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserSubject implements Subject {

    private final List<Observer> observers;
    private String message;

    public UserSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(message);
        }
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}
