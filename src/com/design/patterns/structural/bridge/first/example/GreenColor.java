package com.design.patterns.structural.bridge.first.example;

public class GreenColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("green.");
    }
}
