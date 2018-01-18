package com.design.patterns.behavioral.observer.third.example;

public class Observer1 implements IObserver {

    private String name;

    public Observer1(String name) {
        this.name = name;
    }

    @Override
    public void update(int i) {
        System.out.println(this.name + ": observes -> myValue is changed in Subject to :" + i);
    }
}
