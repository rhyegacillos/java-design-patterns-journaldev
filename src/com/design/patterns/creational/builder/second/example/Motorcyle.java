package com.design.patterns.creational.builder.second.example;

// Motorcyle is a ConcreteBuilder
public class Motorcyle implements IBuilder {

    private Product product = new Product();

    @Override
    public void BuildBody() {
        product.Add("This is the body of a Motorcyle");
    }

    @Override
    public void InsertWheels() {
        product.Add("2 wheels are added");
    }

    @Override
    public void AddHeadlights() {
        product.Add("1 Headlights are added");
    }

    @Override
    public Product GetVehicle() {
        return product;
    }
}
