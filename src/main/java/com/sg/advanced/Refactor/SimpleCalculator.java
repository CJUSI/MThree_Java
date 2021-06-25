package com.sg.advanced.Refactor;

import java.util.Scanner;

public class SimpleCalculator {

    private double operandOne;
    private double operandTwo;
    private char operator;

    public double getOperandOne(){
        return operandOne;
    }
    public double getOperandTwo(){
        return operandTwo;
    }
    public char getOperator(){
        return operator;
    }
    public void setOperandOne(double operandOne){
        this.operandOne = operandOne;
    }
    public void setOperandTwo(double operandTwo){
        this.operandTwo = operandTwo;
    }
    public void setOperator(char operator){
        this.operator = operator;
    }

    //Behaviour
    public double Add(){
        return operandOne + operandTwo;
    }
    public double Subtract(){
        return operandOne - operandTwo;
    }
    public double Multiply(){
        return operandOne * operandTwo;
    }
    public double Divide (){
        return operandOne / operandTwo;
    }
}
