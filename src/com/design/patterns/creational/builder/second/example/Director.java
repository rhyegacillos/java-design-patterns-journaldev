package com.design.patterns.creational.builder.second.example;

public class Director {

    IBuilder myBuilder;

    // A series of steps-for the production
    public void Construct(IBuilder builder) {
        myBuilder = builder;
        myBuilder.BuildBody();
        myBuilder.InsertWheels();
        myBuilder.AddHeadlights();
    }
}
