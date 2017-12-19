package com.design.patterns.creational.abstractFactory.first.example;

import com.design.patterns.creational.factory.first.example.Computer;
import com.design.patterns.creational.factory.first.example.Server;

public class ServerFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }
}
