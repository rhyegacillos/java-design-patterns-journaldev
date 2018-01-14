package com.design.patterns.behavioral.chainOfResponsibility.second.example;

public class EmailErrorHandler implements IReceiver {

    private IReceiver nextReceiver;

    public EmailErrorHandler(IReceiver nextReceiver) {
        this.nextReceiver = nextReceiver;
    }

    @Override
    public boolean processMessage(Message message) {
        if (message.text.contains("Email")) {
            System.out.println("EmailErrorHandler processed " + message.priority + " priority issue: " + message.text);
            return true;
        } else {
            if (nextReceiver != null) {
                nextReceiver.processMessage(message);
            }
        }
        return false;
    }
}
