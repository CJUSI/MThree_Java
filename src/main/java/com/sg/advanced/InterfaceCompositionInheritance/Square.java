package com.sg.advanced.InterfaceCompositionInheritance;

class Square extends Shape {
    private int sideLength;

    //Constructor
    public Square(int sideLengthIn){
        this.sideLength = sideLengthIn;
    }

    @Override
    public double getArea(){
        return sideLength * sideLength;
    }
    @Override
    public double getPerimeter(){
        return sideLength *4;
    }
}

