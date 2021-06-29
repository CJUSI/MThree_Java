package com.sg.advanced.FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.*;


public class StateCapitals2 {
    public static void main(String[] args) throws Exception {
        //Create Hash map to store state capital pairs
        Map<String, String> capitals = new HashMap<>();
        String line;

        //Load the file
        FileReader fr = new FileReader("C:/Users/cjusm/Downloads/StateCapitals.txt");
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner (br);
        Scanner userInput = new Scanner(System.in);

        while(sc.hasNextLine()){
            String currentLine = sc.nextLine();
            String [] tokens = currentLine.split("::");
            capitals.put(tokens[0], tokens[1]);
        }
        System.out.println("Number of State/Capital Pairs: " + capitals.size());


        System.out.println("STATES: ");
        System.out.println("=======");
        Set<String> keys = capitals.keySet();
        for (String x : keys){
            System.out.print(x + ", ");
        }

        Random randNum = new Random();
        int randStateNo = randNum.nextInt(keys.size());
        int i = 0;
        String correctAns = null;

        for (String x : keys){
            if (i == randStateNo) {
                System.out.println("\nWhat is the capital of " + x + "?");
                correctAns = capitals.get(x);
            }
            i++;
        }
        
        String userAns = userInput.nextLine();
        if (userAns.equals(correctAns)){
            System.out.println("Congratulations, you are correct!");
        }else{
            System.out.println("That is incorrect.");
        }
        










    }



}
