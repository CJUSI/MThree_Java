package com.sg.foundations.scanner;

import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args) {
        //Initialise variables for madlibs game
        String noun1;
        String adjective1;
        String noun2;
        int num1;
        String adjective2;
        String pnoun1, pnoun2, pnoun3;
        String verbpt;
        String verbot;

        //Initialise scanner and gather variables from user input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("I need a noun: ");
        noun1 = myScanner.nextLine();
        System.out.println("Now an Adjective: ");
        adjective1 = myScanner.nextLine();
        System.out.println("Another noun:  ");
        noun2 = myScanner.nextLine();
        System.out.println("And a number: ");
        num1 = Integer.parseInt(myScanner.nextLine());
        System.out.println("Another Adjective: ");
        adjective2 = myScanner.nextLine();
        System.out.println("Plural Noun: ");
        pnoun1 = myScanner.nextLine();
        System.out.println("Another one: ");
        pnoun2 = myScanner.nextLine();
        System.out.println("One more: ");
        pnoun3 = myScanner.nextLine();
        System.out.println("A verb (infinitive form): ");
        verbpt = myScanner.nextLine();
        System.out.println("Same verb (past participle): ");
        verbot = myScanner.nextLine();

        //Print results to screen
        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.println(noun1 + ": the " +  adjective1 + " frontier. These are the voyages of the starship " + noun2 + ". Its " +  num1 + "-year mission: to explore strange " + adjective2 + " " + pnoun1 + " to seek out " + adjective2 + " " + pnoun2 + " and " + adjective2 + " " + pnoun3 + " to boldly " + verbpt + " where no one has " + verbot + " before.");

    }
}
