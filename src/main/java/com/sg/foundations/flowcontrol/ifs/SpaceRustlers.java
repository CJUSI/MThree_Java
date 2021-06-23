package com.sg.foundations.flowcontrol.ifs;

public class SpaceRustlers {
    public static void main(String[] args) {

        int spaceships = 100;
        int aliens = 25;
        int cows = 100;
        //The if and else statement will print the if nested string if aliens outnumber spaceships, otherwise it will print the else nested string

        if(aliens > spaceships){
            System.out.println("Vrroom, vroom! Let's get going!");
        } else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }
        //Taking out the else from else if  caused the else statement to be triggered as it was linked to the middle if statement
        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        }else if (cows > spaceships){
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        } else {
            System.out.println("Too many ships! Not enough cows.");
        }
        if (aliens > cows){
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
        }else {
            System.out.println("Oh no! The herd got restless and took over! Looks like _we're_ hamburger now!!");

        }

    }
}
