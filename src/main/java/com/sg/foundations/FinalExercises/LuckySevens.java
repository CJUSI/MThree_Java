package com.sg.foundations.FinalExercises;

import java.util.Random;
import java.util.Scanner;

public class LuckySevens {
    public static void main(String[] args) {

        //Declare variables and initialise objects for random numbers and userinput
        int noOfDollars;
        int maxDollars = 0;
        int noOfRolls = 0;
        int maxDollarIndex = 0;
        int diceRoll1;
        int diceRoll2;
        Scanner userInput = new Scanner(System.in);
        Random diceRoll = new Random();

        //Get user input for initial dollar amount
        System.out.println("How many dollars do you have? ");
        noOfDollars = Integer.parseInt(userInput.nextLine());


        while (noOfDollars > 0){

            int tempIndex = noOfRolls;
            if (noOfDollars > maxDollars){
                maxDollars = noOfDollars;
                maxDollarIndex = tempIndex;
            }

            diceRoll1 = diceRoll.nextInt(6) + 1;
            diceRoll2 = diceRoll.nextInt(6) + 1;
            noOfRolls++;

            if ((diceRoll1 + diceRoll2) == 7){
                noOfDollars+=4;
            }else{
                noOfDollars-=1;
            }

        }
        System.out.println("You are broke after " + noOfRolls + " rolls." );
        System.out.println("You should have quit after " + maxDollarIndex + " rolls when you had $" + maxDollars + ".");


    }
}
