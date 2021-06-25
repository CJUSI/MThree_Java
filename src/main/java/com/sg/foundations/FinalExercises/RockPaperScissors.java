package com.sg.foundations.FinalExercises;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public void playRPS (){
        //declare required variables
        int noOfRounds;
        String [] RPSChoice = {"Rock", "Paper", "Scissors"};
        int noOfTies = 0;
        int userWins = 0;
        int compWins = 0;
        String userChoice;
        int compChoice;
        String playAgainTemp;
        boolean playAgain = true;

        //Initialise objects for random and user input
        Scanner userInput = new Scanner(System.in);
        Random randRPS = new Random();

        //While loop to keep program running
        do {
            System.out.println("How many rounds would you like to play? ");
            noOfRounds = Integer.parseInt(userInput.nextLine());
            if (noOfRounds < 1 || noOfRounds > 10){
                System.out.println("That is an invalid number of rounds.");
                break;
            }
            for (int i = 0; i < noOfRounds; i++){
                System.out.println("Please choose Rock, Paper or Scissors: ");
                userChoice = userInput.nextLine();
                compChoice = randRPS.nextInt(3);
                System.out.println("The computer chose:  " + RPSChoice[compChoice]);

                //Condense if statements to 3 for each outcome
                if (RPSChoice[compChoice].equals(userChoice)){
                    noOfTies++;
                }else if ((userChoice.equals("Rock") && (RPSChoice[compChoice].equals("Scissors")))||(userChoice.equals("Paper") && (RPSChoice[compChoice].equals("Rock")))||(userChoice.equals("Scissors") && (RPSChoice[compChoice].equals("Paper")))){
                    userWins++;
                }else if ((userChoice.equals("Rock") && (RPSChoice[compChoice].equals("Paper")))||(userChoice.equals("Paper") && (RPSChoice[compChoice].equals("Scissors")))||(userChoice.equals("Scissors") && (RPSChoice[compChoice].equals("Rock")))){
                    compWins++;
                }else {
                    System.out.println("That is not a valid Choice!");
                }
            }

            //Print results
            System.out.println("User Wins: " + userWins);
            System.out.println("Computer Wins: " + compWins);
            System.out.println("Ties: " + noOfTies);

            if (userWins > compWins){
                System.out.println("You Win!!");
            } else if (compWins > userWins){
                System.out.println("You Lose!!");
            }else {
                System.out.println("It's a Draw!!");
            }

            //Ask whether the user wants to play again:
            System.out.println("Would you like to play again? Y/N");
            playAgainTemp = userInput.nextLine();
            if (playAgainTemp.equals("Y")){
                noOfTies = 0;
                userWins = 0;
                compWins = 0;
            } else {
                System.out.println("Thanks for playing!");
                playAgain = false;
            }


        } while (playAgain);
    }
}
