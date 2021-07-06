package com.sg.intermediate.enums.dow;

import java.util.Scanner;


public class DoWApp {
    public static void main(String[] args) {

        //Initialise scanner and other objects
        Scanner userIO = new Scanner(System.in);
        SwitchWeek daySwitch = new SwitchWeek();
        System.out.println("Please Enter a Day: ");
        String DayOfWeek = userIO.nextLine();
        DaysOfWeekEnum daysEnum = DaysOfWeekEnum.valueOf(DayOfWeek.toUpperCase());
        System.out.println("There are " + daySwitch.PrintDays(daysEnum) + " days left till Friday!");







    }
}
