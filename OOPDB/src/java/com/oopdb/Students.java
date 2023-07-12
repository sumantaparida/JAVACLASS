package com.oopdb;

public class Students {

    private int id, fees;
    private String name, course;

    public Students(int id, String name, String course, int fees) {
        this.id = id;
        this.fees = fees;
        this.name = name;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public int getFees() {
        return fees;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

}
