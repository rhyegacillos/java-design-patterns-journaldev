package com.design.patterns.behavioral.mediator.first.example;

public interface ChatMediator {

    void sendMessage(String msg, User user);
    void addUser(User user);
}
