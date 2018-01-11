package com.design.patterns.structural.bridge.first.example;

public abstract class Shape {
    // Composition - implementor
    protected Color color;

    // constructor with implementor as input argument

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
