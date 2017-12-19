package com.design.patterns.creational.factory.second.example;

interface IAnimal {
    void speak();
}

class Duck implements IAnimal {

    @Override
    public void speak() {
        System.out.println("Duck says: quack quack");
    }
}

class Tiger implements IAnimal {

    @Override
    public void speak() {
        System.out.println("Tiger says: Halum.. Halum ");
    }
}

abstract class IAnimalFactory {
    public abstract IAnimal getAnimalType(String type) throws Exception;
}

class ConcreteFactory extends IAnimalFactory {

    @Override
    public IAnimal getAnimalType(String type) throws Exception {

        switch (type) {
            case "Duck":
                return new Duck();
            case "Tiger":
                return new Tiger();
            default:
                throw new Exception("Animal type: " + type + " cannot be instantiated");
        }
    }
}




public class FactoryPatternExApp {

    public static void main(String[] args) throws Exception {
        System.out.println("***Factory Pattern Demo***\n");
        IAnimalFactory animalFactory = new ConcreteFactory();
        IAnimal duck = animalFactory.getAnimalType("Duck");
        duck.speak();

        IAnimal tiger = animalFactory.getAnimalType("Tiger");
        tiger.speak();

        //There is no Lion type, So, an exception will be thrown
        IAnimal lion = animalFactory.getAnimalType("Lion");
        lion.speak();
    }

}
