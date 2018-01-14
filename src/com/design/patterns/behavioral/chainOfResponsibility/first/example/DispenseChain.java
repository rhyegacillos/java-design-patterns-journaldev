package com.design.patterns.behavioral.chainOfResponsibility.first.example;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}
