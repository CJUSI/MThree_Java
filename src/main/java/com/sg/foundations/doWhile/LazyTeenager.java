package com.sg.foundations.doWhile;

import java.util.Random;
import java.util.Scanner;

public class LazyTeenager {
    public static void main(String[] args) {

        //Initialise variables and objects required
        Random randNum = new Random();
        Scanner myScanner = new Scanner(System.in);
        int counter = 0;

        do {
            counter++;
            System.out.println("Clean your room!!");
            if (counter == 7){
                System.out.print("That's IT, I'm doing it!!! YOU'RE GROUNDED AND IM TAKING YOUR XBOX!");
                break;
            }
            //generate random number between 1 and 10
            int chanceCheck = randNum.nextInt(10);
            if (chanceCheck < counter){
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS");
                break;
            }

        } while (true);



    }
}
