package com.sg.foundations.flowcontrol.ifs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MiniZork {
    public static void main(String[] args) {

        //Field -> House || Mailbox
        Scanner userInput = new Scanner(System.in);
        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        //Mailbox -> look inside || Stick your hand in
        String action = userInput.nextLine();
        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");

            //Look inside -> run away || keep looking
            action = userInput.nextLine();
            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                //END NODE -> Eaten by grue (Die) || Run away (Survive)
                action = userInput.nextLine();
                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you're alive. Possibly a wise choice.");
                }

                //Stick your hand in -> Squeeze hard || pull it out
            } else if (action.equals("stick your hand in")) {
                System.out.println("You stick your hand into the mailbox.");
                System.out.println("It feels damp and mouldy.");
                System.out.println("Suddenly, you feel a twitch on your hand...");
                System.out.println("Squeeze hard or pull it out?");

                //END NODE: Squeeze hard -> Pass out (Die)
                action = userInput.nextLine();
                if (action.equals("Squeeze hard")){
                    System.out.println("You squeeze your hand into a fist hard and fast.");
                    System.out.println("You feel it writhing around in your hand.");
                    System.out.println("Suddenly, it shoots into your skin and you pass out...");
                    // Pull it out -> investigate woods || Run away
                } else if (action.equals("pull it out")){
                    System.out.println("Your fast movements have startled whatever was inside.");
                    System.out.println("It lets out a shrieking whistle!");
                    System.out.println("The nearby woods reacted to the sound and try to draw you in, investigate or run?");

                    //investigate -> Face the noise || run deeper
                    action = userInput.nextLine();
                    if (action.equals("investigate")) {
                        System.out.println("You walk over to the entrance of the woods.");
                        System.out.println("Whispers get louder and draw you deeper.");
                        System.out.println("You hear a scream behind you, face the noise or run deeper?");

                        //END NODE: Face the noise -> leave woods (safe)
                        action = userInput.nextLine();
                        if(action.equals("face the noise")){
                            System.out.println("You turn around and there is nothing there");
                            System.out.println("You  leave the woods and head back. Safe.");
                            //END NODE: run deeper -> see a witch (die)
                        } else if(action.equals("run deeper")){
                            System.out.println("You run deeper into the woods.");
                            System.out.println("you fall over a big tree stump.");
                            System.out.println("The last thing you see is a witch before you pass out.");
                        }
                        //END NODE: run -> Drive away (safe)
                    }else if (action.equals("run")){
                        System.out.println("You run away to your vehicle.");
                        System.out.println("Drive away as fast as you can! Safe.");
                    }
                }
            }
            //
        } else if (action.equals("go to the house")) {
            System.out.println("You walk over to the house.");
            System.out.println("It looks old and decrepit.");
            System.out.println("You can see some flickering through the windows.");
            System.out.println("Look inside the window or go inside the house.");

            //House -> go inside (Die) | Look through window (safe)
            action = userInput.nextLine();
            if (action.equals("Look inside")){
                System.out.println("You creek open the door.");
                System.out.println("You see a faint flicker of a candle");
                System.out.println("Someone grips your shoulder and your blood turns to ice.");
            } else if (action.equals("Look through window")){
                System.out.println("You peer through the window");
                System.out.println("Looks far too creepy to investigate further.");
                System.out.println("You stroll back to your vehicle and drive home.");
            }
        }
    }
}
