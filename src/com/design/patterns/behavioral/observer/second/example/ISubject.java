package com.design.patterns.behavioral.observer.second.example;

public interface ISubject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
