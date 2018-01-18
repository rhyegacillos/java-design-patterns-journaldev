package com.design.patterns.behavioral.observer.third.example;

public class ObserverPatternEx2 {

    public static void main(String[] args) {
        System.out.println("***Modified Observer Pattern Demo***");
        Subject sub = new Subject();
        IObserver obj1 = new Observer1("obj1");
        IObserver obj2 = new Observer2("obj2");

        sub.register(obj1);
        sub.register(obj2);

        sub.setMyValue(5);
        System.out.println();
        sub.setMyValue(25);
        System.out.println();

        // unregister obj1 only
        sub.unregister(obj1);
        //now only obj2 will observer the change
        sub.setMyValue(100);
    }
}
