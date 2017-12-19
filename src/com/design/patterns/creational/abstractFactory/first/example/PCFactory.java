package com.design.patterns.creational.abstractFactory.first.example;

import com.design.patterns.creational.factory.first.example.Computer;
import com.design.patterns.creational.factory.first.example.PC;

public class PCFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}
