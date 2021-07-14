package com.sg.foundations.FinalExercises;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class InterestCalculator {
    public void CalculateInterest(){

        //Declare required String variables for UI
        String userPrincipal;
        int noOfYears;
        String annualInterestRate;

        //Big Decimals
        BigDecimal currentBalance;
        BigDecimal quarterlyInterestRate;

        //get user input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How much do you want to invest?");
        userPrincipal = myScanner.nextLine();
        System.out.println("How many years do you wish to invest?");
        noOfYears = Integer.parseInt(myScanner.nextLine());
        System.out.println("What is the % interest rate you will be saving at?");
        annualInterestRate = myScanner.nextLine(); //Add /100

        //Create Big decimals from UI
        BigDecimal principalBd = new BigDecimal(userPrincipal);
        BigDecimal annualIRbd = new BigDecimal(annualInterestRate);
        BigDecimal quarterlyIRbd = annualIRbd.divide(new BigDecimal("400"), 2, RoundingMode.HALF_UP);
        currentBalance = principalBd;
        quarterlyIRbd = quarterlyIRbd.add(new BigDecimal("1"));

        //Create Big decimals with a scale of 2 dp and Half_Up rounding


        //nested for loop to compute and print results
        System.out.println("Calculating......");
        for (int i = 1; i <= noOfYears; i++){
            BigDecimal tempBalance = currentBalance;
            System.out.println("Year " + i + ":");
            System.out.println("Began with: $" + currentBalance.setScale(2, RoundingMode.HALF_UP));
            for (int j = 0; j < 4; j++){
                currentBalance = currentBalance.multiply(quarterlyIRbd).setScale(2, RoundingMode.HALF_UP);
            }
            System.out.println("Earned: $" + currentBalance.subtract(tempBalance));
            System.out.println("Ended With: $" + currentBalance.setScale(2));
        }
    }
}
