package com.sg.advanced.Refactor;

import java.util.Scanner;

public class CalcUI {
    public static void main(String[] args) {
        while(true) {
            SimpleCalculator newCalc = new SimpleCalculator();
            Scanner myScanner = new Scanner(System.in);

            System.out.println("Which operator do you wish to perform (+|-|/|*)(X for Exit): ");
            newCalc.setOperator(myScanner.nextLine().charAt(0));
            if (newCalc.getOperator() == 'X') {
                System.out.println("Thanks for using my Calculator! Goodbye!");
                System.exit(0);
            }
            System.out.println("Please Enter First Operand: ");
            newCalc.setOperandOne(Double.parseDouble(myScanner.nextLine()));
            System.out.println("Please Enter Second Operand: ");
            newCalc.setOperandTwo(Double.parseDouble(myScanner.nextLine()));

            switch (newCalc.getOperator()) {
                case '+':
                    System.out.println(newCalc.getOperandOne() + " " + newCalc.getOperator() + " " + newCalc.getOperandTwo() + " = " + newCalc.Add());
                    break;
                case '-':
                    System.out.println(newCalc.getOperandOne() + " " + newCalc.getOperator() + " " + newCalc.getOperandTwo() + " = " + newCalc.Subtract());
                    break;
                case '/':
                    System.out.println(newCalc.getOperandOne() + " " + newCalc.getOperator() + " " + newCalc.getOperandTwo() + " = " + newCalc.Divide());
                    break;
                case '*':
                    System.out.println(newCalc.getOperandOne() + " " + newCalc.getOperator() + " " + newCalc.getOperandTwo() + " = " + newCalc.Multiply());
                    break;
                default:
                    System.out.println("That is not a valid operator. ");
                    break;


            }
        }
    }
}
