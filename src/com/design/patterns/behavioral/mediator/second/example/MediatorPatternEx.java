package com.design.patterns.behavioral.mediator.second.example;

import java.awt.*;

abstract class Mediator {
    public abstract void send(Friend friend, String msg);
}

// Concrete Mediator
class ConcreteMediator extends Mediator {
    private Friend1 friend1;
    private Friend2 friend2;
    private Boss boss;

    public void setFriend1(Friend1 friend1) {
        this.friend1 = friend1;
    }

    public void setFriend2(Friend2 friend2) {
        this.friend2 = friend2;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    @Override
    public void send(Friend friend, String msg) {
        // In all cases, boss is notified
        if(friend == friend1) {
            friend2.notify(msg);
            boss.notify(friend1.name + " sends message to " + friend2.name);
        }

        if(friend == friend2) {
            friend1.notify(msg);
            boss.notify(friend2.name + " sends message to " + friend1.name);
        }

        //Boss is sending message to others
        if(friend == boss) {
            friend1.notify(msg);
            friend2.notify(msg);
        }
    }
}

//Friend
abstract class Friend {
    protected Mediator mediator;
    public String name;

    public Friend(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String msg);
    public abstract void notify(String msg);
}

// Friend1 - first participant
class Friend1 extends Friend {
    public Friend1(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    public void send(String msg) {
        mediator.send(this, msg);
    }

    public void notify(String msg) {
        System.out.println(this.name + " gets message: " + msg);
    }
}

// Friend 2 - Second participant
class Friend2 extends Friend {

    public Friend2(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }


    @Override
    public void send(String msg) {
        mediator.send(this, msg);
    }

    @Override
    public void notify(String msg) {
        System.out.println(this.name + " gets message: " + msg);
    }
}

// Friend3 - Third participant. He is the boss. He is notified whenever friend1 and friend2 commmunicate
class Boss extends Friend {

    public Boss(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    @Override
    public void send(String msg) {
        mediator.send(this, msg);
    }

    @Override
    public void notify(String msg) {
        System.out.println("\nBoss sees message: " + msg + "\n");
    }

}


public class MediatorPatternEx {

    public static void main(String[] args) {
        System.out.println("***Mediator Pattern Demo***");
        ConcreteMediator m = new ConcreteMediator();

        Friend1 Rhye = new Friend1(m, "Rhye");
        Friend2 Michael = new Friend2(m, "Michael");
        Boss Aphy = new Boss(m, "Aphy");

        m.setFriend1(Rhye);
        m.setFriend2(Michael);
        m.setBoss(Aphy);

        Rhye.send("[Rhye here]Good Morning. Can we discuss the mediator pattern");
        Michael.send("[Michael here]Good Morning. Yes, we can discuss now.");
        Aphy.send("[Aphy here]: Please get back to work quickly");
    }
}
