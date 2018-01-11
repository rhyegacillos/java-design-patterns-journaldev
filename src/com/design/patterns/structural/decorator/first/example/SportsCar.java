package com.design.patterns.structural.decorator.first.example;

public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.println("Adding features of Sports Car.");
    }
}
