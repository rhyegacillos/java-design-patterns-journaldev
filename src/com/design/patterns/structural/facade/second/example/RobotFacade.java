package com.design.patterns.structural.facade.second.example;

public class RobotFacade {
    RobotColor rc;
    RobotMetal rm;
    RobotBody rb;

    public RobotFacade() {
        this.rc = new RobotColor();
        this.rm = new RobotMetal();
        this.rb = new RobotBody();
    }

    public void constructRobot(String color, String metal) {
        System.out.println("\nCreation of the Robot Start");
        rc.setColor(color);
        rm.setMetal(metal);
        rb.createBody();
        System.out.println("\nRobot Creation End");
        System.out.println();
    }
}
