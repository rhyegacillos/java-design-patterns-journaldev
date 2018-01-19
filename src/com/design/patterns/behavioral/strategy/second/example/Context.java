package com.design.patterns.behavioral.strategy.second.example;

public class Context {

    Choice myChoice;

    // set a strategy or algorithm in the Context
    public void setChoice(Choice choice) {
        myChoice = choice;
    }

    public void showChoice(String s1, String s2) {
        myChoice.myChoice(s1, s2);
    }
}
