package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {
        //initialise variables required
        int number = 46;
        int guess;

        //initialise scanner object
        Scanner myScanner = new Scanner(System.in);

        //Get user input for the guess
        System.out.println("Please Guess a number between 1 and 100!");
        guess = Integer.parseInt(myScanner.nextLine());

        if (guess == number){
            System.out.println("Wow, nice guess! That was it!");
        }
        if (guess < number){
            System.out.println("Ha, nice try - too low! I chose " + number);
        }
        if (guess > number){
            System.out.println("Too bad, way too high. I chose " + number);
        }
    }
}
