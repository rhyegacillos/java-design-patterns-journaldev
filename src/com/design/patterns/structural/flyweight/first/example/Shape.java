package com.design.patterns.structural.flyweight.first.example;

import java.awt.*;

public interface Shape {
    public void draw(Graphics g, int x, int y, int width, int height, Color color);
}
