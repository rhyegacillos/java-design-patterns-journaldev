package com.design.patterns.behavioral.observer.second.example;

public class Observer {
    String name;

    public Observer(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println(this.name + ": flag value changed in subject");
    }
}
