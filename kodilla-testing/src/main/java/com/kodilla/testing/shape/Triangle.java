package com.kodilla.testing.shape;

public class Triangle implements Shape {

    double h;
    double a;

    public Triangle (double h, double a) {
        this.h = h;
        this.a = a;
    }


    public String getShapeName(){
        return "Triangle";
    }

    public double getField (double a,double h) {
        return a * h / 2;
    }
}
