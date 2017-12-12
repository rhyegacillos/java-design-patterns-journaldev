package com.builder.pattern;

public class BuilderPatternTestApp {

    public static void main(String[] args) {
        Computer computer1 = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true).build();
        Computer computer2 = new Computer.ComputerBuilder("256 GB", "1 GB").build();
        Computer computer3 = new Computer.ComputerBuilder("320 GB", "4 GB").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();

        System.out.println("Computer 1 : " + computer1);
        System.out.println("Computer 2 : " + computer2);
        System.out.println("Computer 3 : " + computer3);
    }
}
