package com.sg.intermediate.enums.mathop;


import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {

        //Initialise scanner and other objects
        Scanner userIO = new Scanner(System.in);
        MathOperationSwitch opSwitch = new MathOperationSwitch();
        System.out.println("Please Enter an operation(Plus, Minus, Multiply, Divide): ");
        String operator = userIO.nextLine();

        System.out.println("Please Enter your First Number: ");
        int num1 = userIO.nextInt();
        System.out.println("Please Enter your Second Number");
        int num2 = userIO.nextInt();
        MathOperator opEnum = MathOperator.valueOf(operator.toUpperCase());
        System.out.println("Result:  " + opSwitch.calculate(opEnum, num1, num2));
    }
}
