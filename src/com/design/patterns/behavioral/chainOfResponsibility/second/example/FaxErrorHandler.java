package com.design.patterns.behavioral.chainOfResponsibility.second.example;

public class FaxErrorHandler implements IReceiver{
    private IReceiver nextReceiver;

    public FaxErrorHandler(IReceiver nextReceiver) {
        this.nextReceiver = nextReceiver;
    }

    @Override
    public boolean processMessage(Message message) {
        if (message.text.contains("Fax")) {
            System.out.println("FaxErrorHandler processed " + message.priority + " priority issue: " + message.text);
            return true;
        } else {
            if(this.nextReceiver != null)
                this.nextReceiver.processMessage(message);
        }

        return false;
    }
}
