package com.sg.advanced.FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StateCapitalsApp {
    public static void main(String[] args) throws Exception {

        //Create Hash map to store state capital pairs
        Map<String, Capital> capitals = new HashMap<>();
        String line;

        //Load the file
        FileReader fr = new FileReader("C:/Users/cjusm/Downloads/MoreStateCapitals.txt");
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(br);
        Scanner userInput = new Scanner(System.in);


        //Populate Hash map
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            String[] tokens = currentLine.split("::");
            Capital tempObject = new Capital(tokens[1], Integer.parseInt(tokens[2]), Double.parseDouble(tokens[3]));
            capitals.put(tokens[0], tempObject);
        }

        //Print out States with their corresponding information
        System.out.println(capitals.size() + " STATE/CAPITAL PAIRS LOADED:");
        System.out.println("================================");
        Set<String> keys = capitals.keySet();
        for (String x : keys){
           System.out.println(x + " - " + capitals.get(x).getName() + " | Pop: " + capitals.get(x).getPopulation() + " | Area: " + capitals.get(x).getSquareMileage() + " sq mi" );
        }

        int popLimit;
        double areaLimit;

        System.out.println("Please Enter the lower limit for capital city Population: ");
        popLimit = Integer.parseInt(userInput.nextLine());
        for (String x : keys){
           if(capitals.get(x).getPopulation() > popLimit){
               System.out.println(x + " - " + capitals.get(x).getName() + " | Pop: " + capitals.get(x).getPopulation() + " | Area: " + capitals.get(x).getSquareMileage() + " sq mi" );
           }
        }

        System.out.println("Please Enter the lower limit for capital city Area: ");
        areaLimit = Double.parseDouble(userInput.nextLine());
        for (String x : keys){
            if(capitals.get(x).getPopulation() > areaLimit){
                System.out.println(x + " - " + capitals.get(x).getName() + " | Pop: " + capitals.get(x).getPopulation() + " | Area: " + capitals.get(x).getSquareMileage() + " sq mi" );
            }
        }

    }
}