package com.sg.intermediate.javadt;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MagicalBdayCalc {
    public static void main(String[] args) {

        //Instantiate objects for scanner
        Scanner UI = new Scanner(System.in);

        //Get user Bday in good format
        System.out.println("Welcome to the magical Birthday Calculator!");
        System.out.println("\n\nWhat is your birthday?");
        String userBDay = UI.nextLine();
        System.out.println(userBDay);

        //
        LocalDate timeNow = LocalDate.now();
        LocalDate userBday = LocalDate.parse(userBDay, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println("That means you were born on a " + userBday.getDayOfWeek() + "!");
        int diff = userBday.until(timeNow).getYears();
        LocalDate currentBday = userBday.plusYears(diff);
        System.out.println(currentBday);

        if (currentBday.getYear() == 2021){
            System.out.println("This year it falls on a " + currentBday.getDayOfWeek());
        } else if (currentBday.getYear() == 2020){
            currentBday = currentBday.plusYears(1);
            System.out.println("This year it falls on a " + currentBday.getDayOfWeek());
        }

        LocalDate nextBday = LocalDate.now();

        if(currentBday.compareTo(timeNow) > 0){
            nextBday = currentBday;
        } else if (currentBday.compareTo(timeNow) < 0){
            nextBday = currentBday.plusYears(1);
        } else if ( currentBday.compareTo(timeNow) == 0){
            nextBday = currentBday;
        }

        System.out.println(nextBday);
        System.out.println("And since today is " + timeNow + ", there's only " + timeNow.until(nextBday).getMonths() + " months and " + timeNow.until(nextBday).getDays() + " more days until the next one!");
        System.out.println("Bet you are excited to be " + (diff+1));















        //System.out.println(ld.format(DateTimeFormatter.ofPattern("MM----dd----yyyy")));




    }
}
