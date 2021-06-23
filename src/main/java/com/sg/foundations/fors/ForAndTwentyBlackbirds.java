package com.sg.foundations.fors;

public class ForAndTwentyBlackbirds {
    public static void main(String[] args) {
        //Began birdsInPie counter from 1 instead of 0, started i counter from 1 instead of 0
        int birdsInPie = 1;
        for (int i = 1; i < 24; i++) {
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }

        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
}

