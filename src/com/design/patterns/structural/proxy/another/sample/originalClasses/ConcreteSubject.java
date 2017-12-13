package com.design.patterns.structural.proxy.another.sample.originalClasses;

public class ConcreteSubject extends Subject {
    @Override
    public void doSomeWork() {
        System.out.println("This is from concrete subject");
    }
}
