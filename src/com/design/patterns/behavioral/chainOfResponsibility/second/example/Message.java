package com.design.patterns.behavioral.chainOfResponsibility.second.example;

public class Message {

    public String text;
    public MessagePriority priority;

    public Message(String text, MessagePriority priority) {
        this.text = text;
        this.priority = priority;
    }
}
