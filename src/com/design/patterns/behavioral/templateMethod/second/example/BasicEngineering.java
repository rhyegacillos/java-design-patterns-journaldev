package com.design.patterns.behavioral.templateMethod.second.example;

public abstract class BasicEngineering {
    // Papers() in the template method
    public final void Papers() {
        //Common Papers
        Math();
        SoftSkills();

        //Specialized Paper
        SpecialPaper();
    }

    //Non-abstract method Math(), SoftSkills() are
    //already implemented by Template Class

    private void SoftSkills() {
        System.out.println("SoftSkills");
    }

    private void Math() {
        System.out.println("Mathematics");
    }

    //Abstract method SpecialPaper() must be implemented in derived class
    public abstract void SpecialPaper();
}
