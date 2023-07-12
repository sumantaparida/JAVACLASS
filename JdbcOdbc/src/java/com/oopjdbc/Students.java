/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oopjdbc;

/**
 *
 * @author Admin
 */
public class Students {
    private int id, fees;
    private String name, course;

    public Students() {
    }

    public Students(int id, String name, String course, int fees) {
        this.id = id;
        this.fees = fees;
        this.name = name;
        this.course = course;
    }
    public Students( String name, String course, int fees) {
        this.fees = fees;
        this.name = name;
        this.course = course;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
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
