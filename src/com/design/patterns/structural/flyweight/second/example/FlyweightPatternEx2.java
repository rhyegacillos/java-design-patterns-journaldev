package com.design.patterns.structural.flyweight.second.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

interface IRobot2 {
    void print();
}

class Robot implements IRobot2 {

    String robotType;
    public String colorOfRobot;

    public Robot(String robotType) {
        this.robotType = robotType;
    }

    public void setColor(String colorOfRobot) {
        this.colorOfRobot = colorOfRobot;
    }

    @Override
    public void print() {
        System.out.println("This is a " + robotType + " type robot with " + colorOfRobot + " color");
    }
}

class RobotFactory2 {
    Map<String, IRobot2> shapes = new HashMap<>();

    public int totalObjectsCreated() {
        return shapes.size();
    }

    public IRobot2 getRobotFromFactory(String robotType) throws Exception {
        IRobot2 robotCategory = null;
        if(shapes.containsKey(robotType)) {
            robotCategory = shapes.get(robotType);

        } else {
            switch (robotType) {
                case "King":
                    System.out.println("Creating King Robot...");
                    robotCategory = new Robot("King");
                    shapes.put("King", robotCategory);
                    break;
                case "Queen":
                    System.out.println("Creating Queen Robot...");
                    robotCategory = new Robot("Queen");
                    shapes.put("Queen", robotCategory);
                    break;
                default:
                    throw new Exception("Robot Factory can create only king and queen type robots");
            }
        }
        return robotCategory;
    }
}

//FlyweightPattern is in action.

public class FlyweightPatternEx2 {
    public static void main(String[] args) throws Exception {
        RobotFactory2 myFactory = new RobotFactory2();
        System.out.println("\n***Flyweight Pattern Example Modified***\n");
        Robot shape;

        // Here we are trying to get 3 king type robots
        for (int i = 0; i < 3; i++) {
            shape = (Robot) myFactory.getRobotFromFactory("King");
            shape.setColor(getRandomColor());
            shape.print();
        }

        // Here we are trying to get 3 queen type robots
        for (int i = 0; i < 3; i++) {
            shape = (Robot) myFactory.getRobotFromFactory("Queen");
            shape.setColor(getRandomColor());
            shape.print();
        }

        int numOfDistinctRobots = myFactory.totalObjectsCreated();
        System.out.println("\n Distinct Robot objects created: " + numOfDistinctRobots);

    }

    static String getRandomColor() {
        Random r = new Random();

        int random = r.nextInt();
        if(random%2 == 0)
            return "red";
        else
            return "green";
    }


}
