package com.design.patterns.structural.composite.first.example;

import java.util.List;

public class CompositePatternExApp {

    public static void main(String[] args) {
        Teacher principal = new Teacher("Dr.S.Som", "Principal");

        Teacher mathDept = new Teacher("Mrs.S.Das", "Math Dept. Head");
        Teacher compSciDept = new Teacher("Mr.V.Sarcar", "Comp Science Dept. Head");

        Teacher mathTeacher1 = new Teacher("Math Teacher-1", "Math Teacher");
        Teacher mathTeacher2 = new Teacher("Math Teacher-2", "Math Teacher");

        Teacher compSciTeacher1 = new Teacher("CompSci Teacher-1", "CompSci Teacher");
        Teacher compSciTeacher2 = new Teacher("CompSci Teacher-2", "CompSci Teacher");
        Teacher compSciTeacher3 = new Teacher("CompSci Teacher-3", "CompSci Teacher");


        // Principal is on top of college
        // Department Head - Math and CompSci directly reports to the Principal
        principal.addTeacher(mathDept);
        principal.addTeacher(compSciDept);

        // Teachers of Mathematics directly reports to Math Department Head
        mathDept.addTeacher(mathTeacher1);
        mathDept.addTeacher(mathTeacher2);

        // Teachers of CompSci directly reports to CompSci Department Head
        compSciDept.addTeacher(compSciTeacher1);
        compSciDept.addTeacher(compSciTeacher2);
        compSciDept.addTeacher(compSciTeacher3);

        // Leaf nodes. There is no department under Mathematics
        mathTeacher1.addTeacher(null);
        mathTeacher1.addTeacher(null);

        // Leaf nodes. There is no department under CompSci
        compSciTeacher1.addTeacher(null);
        compSciTeacher2.addTeacher(null);
        compSciTeacher3.addTeacher(null);

        //Printing the details
        System.out.println("***COMPOSITE PATTERN DEMO***");
        System.out.println("\nThe College has following structure");
        System.out.println(principal.getDetails());
        List<ITeacher> deptHead = principal.getControllingDepts();
        for (int i = 0; i < deptHead.size(); i++) {
            System.out.println("\t" + deptHead.get(i).getDetails());
        }

        List<ITeacher> mathTeachers = mathDept.getControllingDepts();
        for (int i = 0; i < mathTeachers.size(); i++) {
            System.out.println("\t\t" + mathTeachers.get(i).getDetails());
        }

        List<ITeacher> compSciTeachers = compSciDept.getControllingDepts();
        for (int i = 0; i < compSciTeachers.size(); i++) {
            System.out.println("\t\t" + compSciTeachers.get(i).getDetails());
        }

        // One comp sci teacher is leaving
        compSciDept.removeTeacher(compSciTeacher2);
        System.out.println("\nAfter " + compSciTeacher2.getTeacherName() + " leaving the organization " +
                            "Comp Science Department has the following employees: ");
        compSciTeachers = compSciDept.getControllingDepts();
        for (int i = 0; i < compSciTeachers.size(); i++) {
            System.out.println("\t\t" + compSciTeachers.get(i).getDetails());
        }


    }
}
