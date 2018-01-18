package com.design.patterns.behavioral.observer.second.example;

public class ObserverPatternEx {
    public static void main(String[] args) {
        System.out.println("***Observer Pattern Demo***");
        Observer o1 = new Observer("o1");
        Observer o2 = new Observer("o2");
        Subject sub1 = new Subject();

        sub1.register(o1);
        sub1.register(o2);
        System.out.println("Setting Flag = 5");
        sub1.setFlag(5);
        System.out.println("Setting Flag = 5");
        System.out.println("Unregister observer 2");
        sub1.unregister(o2);
        sub1.setFlag(4);

    }
}
