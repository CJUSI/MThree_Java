package com.sg.foundations.FinalExercises;

public class App {
    public static void main(String[] args) {

        //initialise objects for game collections
        Factorizer newFactorizer = new Factorizer();
        InterestCalculator newCalc = new InterestCalculator();
        LuckySevens newSeven = new LuckySevens();
        RockPaperScissors newRPS = new RockPaperScissors();

        //Call methods from objects
        newFactorizer.FactorizeNumbers();
        newCalc.CalculateInterest();
        newSeven.playLuckySevens();
        newRPS.playRPS();



    }
}
