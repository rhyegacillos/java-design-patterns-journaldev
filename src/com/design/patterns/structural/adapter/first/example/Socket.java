package com.design.patterns.structural.adapter.first.example;

public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}
