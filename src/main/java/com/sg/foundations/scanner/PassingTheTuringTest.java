package com.sg.foundations.scanner;
import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args) {

        //Initialise variables for conversion
        String name, color, fruit;
        int favNum;

        //Create new Scanner Object
        Scanner myScanner = new Scanner(System.in);

        //Print statements and conversation
        System.out.println("Hello there!");
        System.out.println("What's your name?");
        name = myScanner.nextLine(); //Get name

        System.out.println("Hi, " + name + "I'm R2D2.");
        System.out.println("What is your favourite color?");
        color = myScanner.nextLine();

        System.out.println("Huh, " + color + "? Mine is Electric Lime.");
        System.out.println("I really like limes. They're my favourite fruit, too.");
        System.out.println("What is your favourite fruit " + name + "?");
        fruit = myScanner.nextLine();

        System.out.println("Really? " + fruit + "? That's Wild!");
        System.out.println("Speaking of favourites, what is your favourite number?");
        favNum = Integer.parseInt(myScanner.nextLine());

        System.out.println(favNum + " is a cool number. Mine is -7.");
        System.out.println("Did you know " + favNum + " * " + "-7 is " + (favNum * -7) + "? Thats a cool number too!");
        System.out.println("Well thanks for talking to me " + name + "!");


    }
}
