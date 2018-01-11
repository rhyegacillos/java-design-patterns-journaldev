package com.design.patterns.structural.bridge.second.example;

// Colors - The Implementor
interface IColor {
    void filledWithColor(int border);
}

class RedColor implements IColor {

    @Override
    public void filledWithColor(int border) {
        System.out.println("Red color with " + border + " inch border");
    }
}

class GreenColor implements IColor {

    @Override
    public void filledWithColor(int border) {
        System.out.println("Green color with " + border + " inch border.");
    }
}


// Shapes - The Abstraction
abstract class Shape {
    // Composition
    protected IColor color;

    public Shape(IColor color) {
        this.color = color;
    }

    abstract void drawShape(int border);
    abstract void modifyBorder(int border, int increment);
}

class Triangle extends Shape {

    protected Triangle(IColor color) {
        super(color);
    }

    // Implementer-specific method
    @Override
    void drawShape(int border) {
        System.out.print("This triangle is colored with: ");
        color.filledWithColor(border);
    }

    // Abstraction-specific method
    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are changing the border length " + increment + " times");
        border = border * increment;
        drawShape(border);
    }
}

class Rectangle extends Shape {

    public Rectangle(IColor color) {
        super(color);
    }

    @Override
    void drawShape(int border) {
        System.out.print("This Rectangle is colored with: ");
        color.filledWithColor(border);
    }

    // Abstraction-specific method
    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are changing the border length " + increment + " times");
        border = border * increment;
        drawShape(border);
    }
}
public class BridgePatternDemo {
    public static void main(String[] args) {
        System.out.println("****BRIDGE PATTERN****");

        //Coloring Green to Triangle
        System.out.println("\nColoring Triangle");
        IColor green = new GreenColor();
        Shape triangleShape = new Triangle(green);
        triangleShape.drawShape(20);
        triangleShape.modifyBorder(20, 3);

        //Coloring red to Rectangle
        System.out.println("\nColoring Rectangle");
        Shape rectangleShape = new Rectangle(new RedColor());
        rectangleShape.drawShape(50);
        rectangleShape.modifyBorder(50, 3);
    }
}
