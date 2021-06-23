package com.sg.foundations.scanner;
import java.util.Scanner;

public class DoItBetter {
    public static void main(String[] args) {

        //Initialise variables to use
        int noOfDogs;
        int noOfMiles;
        int noOfLanguages;

        //Initialise scanner object
        Scanner myScanner = new Scanner(System.in);

        //Get user input and brag back
        System.out.println("How many miles can you run?");
        noOfMiles = Integer.parseInt(myScanner.nextLine());
        System.out.println("I can run " + doublePlusOne(noOfMiles) + " Miles.");

        System.out.println("How many hot dogs can you eat?");
        noOfDogs = Integer.parseInt(myScanner.nextLine());
        System.out.println("I can eat " + doublePlusOne(noOfDogs) + " hot dogs.");

        System.out.println("How many languages do you speak?");
        noOfLanguages = Integer.parseInt(myScanner.nextLine());
        System.out.println("I can speak " + doublePlusOne(noOfLanguages) + " languages.");


    }

    private static int doublePlusOne(int original){
        return (original * 2) + 1;
    }
}
