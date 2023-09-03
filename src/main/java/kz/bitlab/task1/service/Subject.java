package kz.bitlab.task1.service;

public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
    void setMessage(String message);
}
