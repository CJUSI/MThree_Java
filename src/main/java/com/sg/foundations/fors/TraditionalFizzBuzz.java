package com.sg.foundations.fors;

import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {

        //Initialise variables and declare objects for input
        int fizzBuzzUnits;
        int FBCounter = 0 ;
        Scanner myScanner = new Scanner(System.in);

        //get user input for fizzbuzzUnits
        System.out.print("Please Input the number of fizzbuzz units you wish to see: ");
        fizzBuzzUnits = Integer.parseInt(myScanner.nextLine());

        //For loop to compute fizz buss
        for (int i = 0; i < 1000; i++){
            if(FBCounter == fizzBuzzUnits){
                System.out.println("TRADITION!!");
                break;

            }
            if (i%3 == 0 && i%5 == 0 && i != 0) {
                System.out.println("fizz buzz");
                FBCounter++;
            }
            else if (i%3 == 0 && i !=0){
                System.out.println("fizz ");
                FBCounter++;
            }
            else if (i%5 == 0 && i != 0){
                System.out.println("buzz");
                FBCounter++;
            } else {
                System.out.println(i);
            }

        }

    }
}
