package com.design.patterns.structural.composite.first.example;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ITeacher {

    private String teacherName;
    private String deptName;
    private List<ITeacher> controls;

    public Teacher(String teacherName, String deptName) {
        this.teacherName = teacherName;
        this.deptName = deptName;
        controls = new ArrayList<>();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void addTeacher(Teacher teacher) {
        controls.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        controls.remove(teacher);
    }

    public List<ITeacher> getControllingDepts() {
        return controls;
    }

    @Override
    public String getDetails() {

        return teacherName + " is the " + deptName;
    }
}
