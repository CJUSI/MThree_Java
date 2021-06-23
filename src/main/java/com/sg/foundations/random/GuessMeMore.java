package com.sg.foundations.random;

import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {
    public static void main(String[] args) {

        //initialise variables required
        int randomNumber;
        int guess;

        //initialise scanner object and random object
        Scanner myScanner = new Scanner(System.in);
        Random rand = new Random();
        randomNumber = rand.nextInt(200) - 100;
        System.out.println(randomNumber);

        //Get user input for the guess
        System.out.println("Please Guess a number between -100 and 100!");

        System.out.println("Your Guess: ");
        guess = Integer.parseInt(myScanner.nextLine());
        if (guess == randomNumber){
            System.out.println("Wow, nice guess! That was it!");
        }
        if (guess < randomNumber){
            System.out.println("Ha, nice try - too low! Try again!");
        }
        if (guess > randomNumber){
            System.out.println("Too bad, way too high. Try again!");
        }

        System.out.println("Your Guess: ");
        guess = Integer.parseInt(myScanner.nextLine());
        if (guess == randomNumber){
            System.out.println("Wow, nice guess! That was it!");
        }
        if (guess < randomNumber){
            System.out.println("Ha, nice try - too low! I chose " + randomNumber);
        }
        if (guess > randomNumber){
            System.out.println("Too bad, way too high. I chose " + randomNumber);
        }
    }

}
