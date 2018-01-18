package com.design.patterns.behavioral.observer.third.example;


public interface ISubject2 {
    void register(IObserver o);
    void unregister(IObserver o);
    void notifyObservers(int i);
}
