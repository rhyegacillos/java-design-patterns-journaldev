package com.design.patterns.structural.flyweight.second.example;


public class FlyweightPatternEx {
    public static void main(String[] args) throws Exception {
        RobotFactory myFactory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Example***\n");

        IRobot shape = myFactory.GetRobotFromFactory("small");
        shape.Print();

        /*Here we are trying to get the object additional 2 times. Note that from
        onward we do not to create additional small robots as we have already created
        this category
         */
        for (int i = 0; i < 2; i++) {
            shape = myFactory.GetRobotFromFactory("small");
            shape.Print();
        }

        int numOfDistinctRobots = myFactory.TotalObjectsCreated();
        System.out.println("\nDistinct Robot object created till now " +
                numOfDistinctRobots);

        /*Here we are trying to get the object 5 times. Note that the second time onward
        we do not need to create additional large robots as we have already created this
        category in the first attempt(at i=0)
         */
        for (int i = 0; i < 5; i++) {
            shape = myFactory.GetRobotFromFactory("large");
            shape.Print();
        }

        numOfDistinctRobots = myFactory.TotalObjectsCreated();
        System.out.println("\nFinally no of Distinct Robot objects created: " + numOfDistinctRobots);

    }
}
