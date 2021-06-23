package com.sg.foundations.doWhile;

public class WaitAWhile {
    public static void main(String[] args) {

        int timeNow = 5;
        int bedTime = 10;

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");

        //Changing bedtimes value to 11, causes the loop to execute 1 more time, going to bed at 11.
        // Loop wouldn't execute as timeNow is never smaller than bedTime.
        //Time no longer increments so loop would be infinite and timeNow would always be < bedTime.

    }
}
