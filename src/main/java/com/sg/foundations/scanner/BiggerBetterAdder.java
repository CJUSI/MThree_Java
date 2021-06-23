package com.sg.foundations.scanner;
import java.util.Scanner;
public class BiggerBetterAdder {
    public static void main(String[] args) {

        //Initialise variables for numbers
        int num1;
        int num2;
        int num3;

        //Initialise scanner object
        Scanner myScanner = new Scanner(System.in);

        //Gather user input and print result to screen
        System.out.println("Please Input your first number: ");
        num1 = Integer.parseInt(myScanner.nextLine());
        System.out.println("Please Input your second number: ");
        num2 = Integer.parseInt(myScanner.nextLine());
        System.out.println("Please Input your third number: ");
        num3 = Integer.parseInt(myScanner.nextLine());
        int result = num1 + num2 + num3;

        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + result + ".");
    }
}
