package com.sg.foundations.FinalExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {

        //Declare required variables
        double annualInterestRate;
        double quarterlyInterestRate;
        double userPrincipal;
        double currentBalance;
        int noOfYears;
        double quarterlyInterest;
        DecimalFormat df = new DecimalFormat("#.##");

        //get user input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How much do you want to invest?");
        userPrincipal = Double.parseDouble(myScanner.nextLine());
        System.out.println("How many years do you wish to invest?");
        noOfYears = Integer.parseInt(myScanner.nextLine());
        System.out.println("What is the % interest rate you will be saving at?");
        annualInterestRate = Double.parseDouble(myScanner.nextLine())/100;
        quarterlyInterestRate = annualInterestRate/4;
        currentBalance = userPrincipal;

        //nested for loop to compute and print results
        System.out.println("Calculating......");
        for (int i = 1; i <= noOfYears; i++){
            double tempBalance = currentBalance;
            System.out.println("Year " + i + ":");
            System.out.println("Began with: $" + df.format(currentBalance));
            for (int j = 0; j < 4; j++){
                currentBalance = currentBalance * (1 + quarterlyInterestRate);
            }
            System.out.println("Earned: $" + df.format((currentBalance - tempBalance)));
            System.out.println("Ended With: $" + df.format(currentBalance));
        }




    }
}
