package com.design.patterns.creational.builder.second.example;

public class BuilderPatternExApp {
    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***\n");
        Director director = new Director();

        IBuilder carBuilder = new Car();
        IBuilder motorBuilder = new Motorcyle();

        // Making Car
        director.Construct(carBuilder);
        Product p1 = carBuilder.GetVehicle();
        p1.Show();

        // Making Motorcyle
        director.Construct(motorBuilder);
        Product p2 = motorBuilder.GetVehicle();
        p2.Show();
    }
}
