package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class YourLifeInMovies {
    public static void main(String[] args) {
        //Initialise required variables
        String name;
        int year;

        //Initialise scanner object and get user input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hey, let's play a game! What's your name? ");
        name = myScanner.nextLine();
        System.out.println("Ok, " + name + ", when were you born?");
        year = Integer.parseInt(myScanner.nextLine());

        //Play game
        System.out.println("Well " + name + "...");
        if (year < 2005){
            System.out.println("Did you know that Pixar's 'Up' came our over a decade ago?");
        }
        if (year < 1995){
            System.out.println("And that the first Harry Potter came out over 15 years ago!");
        }
        if (year < 1985){
            System.out.println("Also, Space Jam came out not last decade, but the one before that!");
        }
        if (year < 1975){
            System.out.println("Additionally, the Original Jurassic Park release is closer to the first lunar landing than it is to today!");
        }
        if (year < 1965){
            System.out.println("Finally, MASH TV series has been around for almost half a century!");
        }
    }
}
