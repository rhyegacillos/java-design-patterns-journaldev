package com.design.patterns.behavioral.strategy.second.example;

public class SecondChoice implements Choice {
    @Override
    public void myChoice(String s1, String s2) {
        System.out.println("You want to concatenate the numbers");
        System.out.println("The result of the addition is: " + s1 + s2);
        System.out.println("***End of the strategy***");
    }
}
