package com.sg.advanced.Interfaces;

import java.util.Scanner;

public class UserIOImpl implements UserIO{

    //declare Scanner variable to get user input
    final private Scanner console = new Scanner(System.in);

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        String userString = console.nextLine();
        return userString;
    }

    @Override
    public int readInt(String prompt) {
        boolean invalidInput = true;
        int newInt = 0;
        while (invalidInput) {
            try {
                newInt = Integer.parseInt(console.nextLine());
                invalidInput = false; // or you can use 'break;'
            } catch (NumberFormatException e) {
                this.print("Invalid Input. Please try again.");
            }
        }

        return newInt;
    }

    @Override
    public int readInt(String prompt, int min, int max) {

        int newInt;
        do {
            System.out.println(prompt);
            newInt = Integer.parseInt(console.nextLine());
        } while(newInt > max || newInt < min);

        return newInt;
    }

    @Override
    public double readDouble(String prompt) {
        while (true) {
            try {
                return Double.parseDouble(this.readString(prompt));
            } catch (NumberFormatException e) {
                this.print("Invalid Input. Please try again.");
            }
        }
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        double newDouble;
        do {
            System.out.println(prompt);
            newDouble = Double.parseDouble(console.nextLine());
        } while(newDouble > max || newDouble < min);

        return newDouble;
    }

    @Override
    public float readFloat(String msgPrompt) {
        while (true) {
            try {
                return Float.parseFloat(this.readString(msgPrompt));
            } catch (NumberFormatException e) {
                this.print("Invalid Input. Please try again.");
            }
        }
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        float newFloat;
        do {
            System.out.println(prompt);
            newFloat = Float.parseFloat(console.nextLine());
        } while(newFloat > max || newFloat < min);

        return newFloat;
    }

    @Override
    public long readLong(String prompt) {
        while (true) {
            try {
                return Long.parseLong(this.readString(prompt));
            } catch (NumberFormatException e) {
                this.print("Invalid Input. Please try again.");
            }
        }
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        long newLong;
        do {
            System.out.println(prompt);
            newLong = Long.parseLong(console.nextLine());
        } while(newLong > max || newLong < min);

        return newLong;
    }
}
