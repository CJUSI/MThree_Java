package com.sg.advanced.ClassModelling;

public class CarInventorySystem {

    public static void main(String[] args) {

        //Create constructor for
        CarInventorySystem newCar = new CarInventorySystem("Tesla", "Model X", "LC58WFW", "Blue", 4);

        //User getters and setters to display info from newCar object
        System.out.println("Make: " + newCar.getMake() + "\nModel: " + newCar.getModel() + "\nPlate: " + newCar.getMake() + "\nColour: " + newCar.getColour());

        //Display Behaviour
        newCar.CountInventory();
        newCar.OrderNewStock();
    }
    public CarInventorySystem (String makeIn, String modelIn, String noPlateIn, String colourIn, int noOfModelIn){
        this.make = makeIn;
        this.model = modelIn;
        this.noPlate = noPlateIn;
        this.colour = colourIn;
        this.noOfModel = noOfModelIn;

    }

    private String make;
    private String model;
    private String noPlate;
    private String colour;
    private int noOfModel;

    //Accessors and Mutators
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getNoPlate(){
        return noPlate;
    }
    public String getColour(){
        return colour;
    }
    public int getNoOfModel(){
        return noOfModel;
    }
    public void setMake(){
        this.make = make;
    }
    public void setModel(){
        this.model = model;
    }
    public void setNoPlate(){
        this.noPlate = noPlate;
    }
    public void setColour(){
        this.colour = colour;
    }
    public void setNoOfModel(){
        this.noOfModel = noOfModel;
    }

    //Methods|Behaviours
    public void CountInventory () {
        System.out.println("Count the inventory of a particular make/model. ");
    }
    public void OrderNewStock () {
        System.out.println("Order New stock of a particular make and model.");
    }
}
