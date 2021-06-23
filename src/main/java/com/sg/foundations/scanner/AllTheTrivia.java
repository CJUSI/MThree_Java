package com.sg.foundations.scanner;
import java.util.Scanner;

public class AllTheTrivia {
    public static void main(String[] args) {

        //Initialise trivia answers
        String largestPlanet;
        String hottestCountry;
        String largestNumber;
        String largestFruit;

        //Initialise new scanner object and gather variables from input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is the largest planet? ");
        largestPlanet = myScanner.nextLine();
        System.out.println("What is the hottest country? ");
        hottestCountry = myScanner.nextLine();
        System.out.println("What is the largest number? ");
        largestNumber = myScanner.nextLine();
        System.out.println("What is the largest fruit?  ");
        largestFruit = myScanner.nextLine();

        System.out.println("The largest planet is " + largestFruit + "!");
        System.out.println("The Hottest country is " + largestNumber + "!");
        System.out.println("The largest number is " + largestPlanet + "!");
        System.out.println("The largest fruit is " + hottestCountry + "!");
    }
}
