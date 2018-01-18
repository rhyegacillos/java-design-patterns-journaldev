package com.design.patterns.behavioral.observer.first.example;

public interface Observer {

    // method to update the observer, used by subject
    void update();

    //attach with subject to observer
    void setSubject(Subject sub);
}
