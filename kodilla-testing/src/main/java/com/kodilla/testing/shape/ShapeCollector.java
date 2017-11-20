package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {


    private ArrayList<Shape> list = new ArrayList<Shape>();



    //1
    public void addFigure(Shape shape){
        //do nothing temp
    }


    //2
    public boolean removeFigure (Shape shape){
       return true; //temporary
    }

    //3
    public Shape getFigure (int n){
        return null; //temp
    }

    public int showFigures(){
        return list.size();

    }
}
