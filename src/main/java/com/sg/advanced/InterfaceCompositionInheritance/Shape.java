package com.sg.advanced.InterfaceCompositionInheritance;

public abstract class Shape {
    String colour;

    public abstract double getArea();

    public abstract double getPerimeter();

    public static void main(String[] args) {

        Shape[] shapeList = new Shape[4];
        shapeList[0] = new Circle(4);
        shapeList[1] = new Triangle(3, 4, 5);
        shapeList[2] = new Square(5);
        shapeList[3] = new Rectangle(4, 5);

        for (Shape x : shapeList) {
            System.out.println("Area: " + x.getArea());
            System.out.println("Perimeter: " + x.getPerimeter());
        }


    }
}
