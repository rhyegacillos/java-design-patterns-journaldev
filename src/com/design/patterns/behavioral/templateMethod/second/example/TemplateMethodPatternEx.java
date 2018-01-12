package com.design.patterns.behavioral.templateMethod.second.example;

public class TemplateMethodPatternEx {
    public static void main(String[] args) {
        System.out.println("***Template Method Pattern Demo***");
        BasicEngineering bs = new ComputerScience();
        System.out.println("Computer Science Papers:");
        bs.Papers();

        System.out.println();

        bs = new Electronics();
        System.out.println("Electronics Papers:");
        bs.Papers();
    }
}
