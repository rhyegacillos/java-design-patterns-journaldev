package com.design.patterns.behavioral.strategy.first.example;

public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardName;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardName, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardName = cardName;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit / debit card");
    }
}
