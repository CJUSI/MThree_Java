package com.sg.foundations.methods;

import java.util.Random;
import java.util.Scanner;

public class BarelyControlledChaos {
    public static void main(String[] args) {

        String color = chooseColour(); // call color method here
        String animal = chooseAnimal(); // call animal method again here
        String colorAgain = chooseColour(); // call color method again here
        int weight = randomNumber(5, 200); // call number method,
        // with a range between 5 - 200
        int distance = randomNumber(10, 20); // call number method,
        // with a range between 10 - 20
        int number = randomNumber(10000, 20000); // call number method,
        // with a range between 10000 - 20000
        int time = randomNumber(2,6); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    static String chooseColour(){
        int randomNum = randomNumber(0,4);
        String[] color = {"Blue","Green","Yellow", "Red", "Purple"};
        return color[randomNum];
    }
    static String chooseAnimal(){
        int randomNum = randomNumber(0,4);
        String[] animal = {"Cat","Dog","Bird", "Ferret", "Hamster"};
        return animal[randomNum];
    }
    static int randomNumber(int randMin, int randMax){
        Random randNum = new Random();
        //System.out.println("Choose a minimum number to generate a random range.");
        //randMin = Integer.parseInt(myScanner.nextLine());
        //System.out.println("Choose a minimum number to generate a random range.");
        //randMax = Integer.parseInt(myScanner.nextLine());
        return randNum.nextInt(randMax-randMin) + randMin;
    }
    // ??? Method 2 ???
    // ??? Method 3 ???
}
