package com.kodilla.testing.shape;

public class Circle implements Shape {


    double r;

    public Circle (double r) {
        this.r = r;
    }


    public String getShapeName(){
        return "Circle";
    }

    @Override
    public double getField() {
        double pi = 3.14;
        return pi * r * r;
    }
}
