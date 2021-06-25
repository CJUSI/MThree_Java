package com.sg.advanced.ClassModelling;

public class House3DDesign {
    public static void main(String[] args) {

        House3DDesign newHouse = new House3DDesign("Callum Smith", 200, 5, 22);
        System.out.println("House Owner: " + newHouse.getOwner() + "\nSquare Feet: " + newHouse.getSqft() + "\nNo. of Floors: " + newHouse.getNoOfFloors() + "\nNo. of Rooms: " + newHouse.getNoOfRooms());

        newHouse.AddRoom();
        newHouse.AddFloor();
        newHouse.DisplaySingleRoom();

    }
    public House3DDesign(String ownerIn, int sqftIn, int noOfFloorsIn, int noOfRoomsIn){
        this.owner = ownerIn;
        this.sqft = sqftIn;
        this.noOfFloors = noOfFloorsIn;
        this.noOfRooms = noOfRoomsIn;
    }

    private String owner;
    private int sqft;
    private int noOfFloors;
    private int noOfRooms;

    //Accessors and Mutators
    public String getOwner(){
        return owner;
    }
    public int getSqft(){
        return sqft;
    }
    public int getNoOfFloors(){
        return noOfFloors;
    }
    public int getNoOfRooms(){
        return noOfRooms;
    }
    public void setOwner(){
        this.owner = owner;
    }
    public void setSqft(){
        this.sqft = sqft;
    }
    public void setNoOfFloors(){
        this.noOfFloors = noOfFloors;
    }
    public void setNoOfRooms(){
        this.noOfRooms = noOfRooms;
    }

    //Methods|Behaviour
    public void AddRoom(){
        System.out.println("Adds a room of a specific dimension to the design.");
    }
    public void DisplaySingleRoom (){
        System.out.println("Display a section of the house seperately.");
    }
    public void AddFloor(){
        System.out.println("Add Another floor onto the house with specific dimensions. ");
    }
}
