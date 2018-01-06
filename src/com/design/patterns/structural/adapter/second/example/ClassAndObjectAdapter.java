package com.design.patterns.structural.adapter.second.example;

interface IIntegerValue {
    public int getInteger();
}

class IntegerValue implements IIntegerValue {

    @Override
    public int getInteger() {
        return 5;
    }
}

class ClassAdapter extends IntegerValue {
    // incrementing by 2
    public int getInteger() {
        return 2 + super.getInteger();
    }
}

class ObjectAdapter {
    private IIntegerValue myInt;

    public ObjectAdapter(IIntegerValue myInt) {
        this.myInt = myInt;
    }

    // Incrementing by 2
    public int getInteger() {
        return 2 + this.myInt.getInteger();
    }
}


public class ClassAndObjectAdapter {

    public static void main(String[] args) {
        System.out.println("***Class and Object Adapter Demo***");
        ClassAdapter ca1 = new ClassAdapter();
        System.out.println("Class Adapter is returning : " + ca1.getInteger());

        ObjectAdapter oa = new ObjectAdapter(new IntegerValue());
        System.out.println("Object Adapter is returning : " + oa.getInteger());
    }
}
