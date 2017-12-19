package com.design.patterns.creational.builder.second.example;

public interface IBuilder {
    void BuildBody();
    void InsertWheels();
    void AddHeadlights();
    Product GetVehicle();
}
