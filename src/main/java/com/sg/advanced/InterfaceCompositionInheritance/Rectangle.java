package com.sg.advanced.InterfaceCompositionInheritance;

class Rectangle extends Shape {
    int sideOne;
    int sideTwo;


    //Constructor
    public Rectangle(int sideOneIn, int sideTwoIn){
        this.sideOne = sideOneIn;
        this.sideTwo = sideTwoIn;

    }
    @Override
    public double getArea(){
        return sideOne * sideTwo;
    }
    @Override
    public double getPerimeter(){
        return (sideOne + sideTwo)*2;
    }

}
