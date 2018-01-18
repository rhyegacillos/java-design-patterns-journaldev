package com.design.patterns.behavioral.observer.third.example;

public class Observer2 implements IObserver {

    private String name;

    public Observer2(String name) {
        this.name = name;
    }

    @Override
    public void update(int i) {
        System.out.println(this.name + ": observes -> myValue is changed in Subject to :" + i);
    }
}
