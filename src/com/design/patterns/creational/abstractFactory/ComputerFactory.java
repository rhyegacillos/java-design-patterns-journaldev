package com.design.patterns.creational.abstractFactory;

import com.design.patterns.creational.factory.Computer;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
