package com.sg.advanced.FileIO;

public class Capital {

    //Values
    String name;
    int population;
    double squareMileage;

    //Constructor
    public Capital(String nameIn, int populationIn, double squareMileageIn){
        this.name = nameIn;
        this.population = populationIn;
        this.squareMileage = squareMileageIn;
    }

    //Accessors and Mutators
    public String getName(){
        return name;
    }
    public int getPopulation(){
        return population;
    }
    public double getSquareMileage(){
        return squareMileage;
    }


    public void setName(){
        this.name = name;
    }
    public void setPopulation(){
        this.population = population;
    }
    public void setSquareMileage(){ this.squareMileage = squareMileage; }


}
