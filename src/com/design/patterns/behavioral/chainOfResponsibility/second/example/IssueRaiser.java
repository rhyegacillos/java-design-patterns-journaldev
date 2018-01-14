package com.design.patterns.behavioral.chainOfResponsibility.second.example;

public class IssueRaiser {
    public IReceiver setFirstReceiver;

    public IssueRaiser(IReceiver firstReceiver) {
        this.setFirstReceiver = firstReceiver;
    }

    public void raiseMessage(Message message) {
        if (setFirstReceiver != null) {
            setFirstReceiver.processMessage(message);
        }
    }
}

