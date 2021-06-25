package com.sg.foundations.FinalExercises;

import java.util.Scanner;

public class Factorizer {
    public void FactorizeNumbers(){
        int userNum;
        int factorCount = 0;
        int cumuFactor = 0;
        Scanner myScanner = new Scanner(System.in);


        //Get User input
        System.out.println("What number would you like to factor: ");
        userNum = Integer.parseInt(myScanner.nextLine());
        int [] factors = new int[userNum];

        System.out.println("The factors of " + userNum + " are: ");
        //For loop to find factors
        for (int i = 1; i <= userNum; i++){
            if (userNum % i == 0){
                factorCount++;
                cumuFactor = cumuFactor + i;
                System.out.print(i + " ");
            }
        }
        System.out.println( "\n"+ userNum + " has " + factorCount + " factors.");

        //Perfect No.
        if(cumuFactor/2 == userNum){
            System.out.println( userNum + " is a perfect number!");
        }else{
            System.out.println(userNum + " is not a perfect number!");
        }

        //Prime No.
        if (factorCount == 2){
            System.out.println(userNum + " is a prime number!");
        }else{
            System.out.println(userNum + " is not a prime number!");
        }
    }
}
