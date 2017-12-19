package com.design.patterns.creational.builder.second.example;

import java.util.LinkedList;

public class Product {

    // We can use data structure that you prefer. We have used LinkedList here.
    private LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<>();
    }

    public void Add(String part) {
        parts.addLast(part);
    }

    public void Show() {
        System.out.println("\nProduct completed as below: ");
        for (int i = 0; i < parts.size(); i++) {
            System.out.println(parts.get(i));
        }
    }
}
