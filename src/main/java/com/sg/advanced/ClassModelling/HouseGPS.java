package com.sg.advanced.ClassModelling;

public class HouseGPS {
    public static void main(String[] args) {

        //Create instance of houseGPS object
        HouseGPS newHouseGPS = new HouseGPS(34348, "England", "South East", "Lambeth");
        System.out.println("This House is located at GPS Coordinates: " + newHouseGPS.getGpsCoordinates() + "\nIn " + newHouseGPS.getBorough() + ", " + newHouseGPS.getRegion() + " of " + newHouseGPS.getCountry());
        newHouseGPS.findClosestHouse();
        newHouseGPS.isLocated();

    }
    public HouseGPS (int gpsCoordinatesIn, String countryIn, String regionIn, String boroughIn){
        this.gpsCoordinates = gpsCoordinatesIn;
        this.country = countryIn;
        this.region = regionIn;
        this.borough = boroughIn;
    }

    private int gpsCoordinates;
    private String country;
    private String region;
    private String borough;

    //Accessors and Mutators
    public int getGpsCoordinates(){
        return gpsCoordinates;
    }
    public String getCountry(){
        return country;
    }
    public String getRegion(){
        return region;
    }
    public String getBorough(){
        return borough;
    }
    public void setGpsCoordinates(){
        this.gpsCoordinates = gpsCoordinates;
    }
    public void setCountry(){
        this.country = country;
    }
    public void setRegion(){
        this.region = region;
    }
    public void setBorough(){
        this.borough = borough;
    }

    //Methods|Behaviour
    public void findClosestHouse(){
        System.out.println("Finds the house closest to the target.");
    }
    public void isLocated (){
        System.out.println("Find out whether that house is located in a particular country, borough or region.");
    }


}
