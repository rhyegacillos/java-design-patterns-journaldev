package com.design.patterns.structural.bridge.first.example;

public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("red.");
    }
}
