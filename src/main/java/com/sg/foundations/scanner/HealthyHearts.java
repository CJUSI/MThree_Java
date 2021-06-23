package com.sg.foundations.scanner;
import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {
        //Initialise variables for display
        int age;
        int maxHeartRate;
        double zoneMin;
        double zoneMax;

        //Initialise scanner object
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your age? ");
        age = Integer.parseInt(myScanner.nextLine());
        maxHeartRate = 220 - age;
        zoneMin = 0.5 * maxHeartRate;
        zoneMax = 0.85 * maxHeartRate;
        System.out.println("Your Maximum Heart rate should be " + maxHeartRate + " beats per minute.");
        System.out.println("Your target HR zone is " + zoneMin + " - " + zoneMax + " beats per minute.");


    }
}
