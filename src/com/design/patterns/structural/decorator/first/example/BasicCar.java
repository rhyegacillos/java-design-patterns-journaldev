package com.design.patterns.structural.decorator.first.example;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Basic Car");
    }
}
