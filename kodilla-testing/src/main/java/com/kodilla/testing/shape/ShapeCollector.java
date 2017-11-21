package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {


    private ArrayList<Shape> list = new ArrayList<Shape>();



    //1
    public void addFigure(Shape shape){
        list.add(shape);
    }


    //2
    public boolean removeFigure (Shape shape){
        if(list.contains(shape))
        {
            return list.remove(shape);
        }
        return false;
    }

    //3
    public Shape getFigure (int n){
        Shape shape = null;
        if(n >= 0 && n <list.size()){
            shape = list.get(n);
        }
        return shape;
    }


    //4
    public int showFigures(){
        System.out.println(list.toArray());
        return list.size();

    }
}
