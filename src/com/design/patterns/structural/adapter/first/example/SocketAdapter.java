package com.design.patterns.structural.adapter.first.example;

public interface SocketAdapter {
    Volt get120Volt();
    Volt get12Volt();
    Volt get3Volt();

}
