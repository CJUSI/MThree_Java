package com.sg.advanced.InterfaceCompositionInheritance;

class Circle extends Shape{
    private int radius;

    //Constructor
    public Circle(int radiusIn){
        this.radius = radiusIn;
    }


    //Inherited Methods from Shape Class
    @Override
    public double getArea(){
        return Math.PI*(radius*radius);
    }
    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}
