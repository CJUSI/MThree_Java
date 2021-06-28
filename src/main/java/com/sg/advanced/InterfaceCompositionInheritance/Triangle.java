package com.sg.advanced.InterfaceCompositionInheritance;

class Triangle extends Shape {
    int sideA;
    int sideB;
    int sideC;

    //Constructor
    public Triangle(int sideAIn, int sideBIn, int sideCIn){
        this.sideA = sideAIn;
        this.sideB = sideBIn;
        this.sideC = sideCIn;
    }

    @Override
    public double getArea(){
        double s = getPerimeter()/2;
        double result = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC)); // Herons Formula
        return Math.round(result);
    }
    @Override
    public double getPerimeter(){
        return sideA + sideB + sideC;
    }
}
