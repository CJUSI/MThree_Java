package com.sg.advanced.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StateCapitals {
    public static void main(String[] args) {
        //create map that maps a State to its capital city
        Map<String, String> capitals = new HashMap<>();

        //Add countries and capital cities
        capitals.put("Alabama", "Montgomery");
        capitals.put("Alaska", "Juneau");
        capitals.put("Arizona", "Phoenix");
        capitals.put("Arkansas", "Little Rock");

        //List keys
        System.out.println("STATES: ");
        System.out.println("=======");
        Set<String> keys = capitals.keySet();
        for (String x : keys){
            System.out.println(x);
        }

        //List Values
        System.out.println("\nCAPITALS: ");
        System.out.println("=========");
        for (String x : keys){
            System.out.println(capitals.get(x));
        }

        System.out.println("\nSTATE/CAPITAL PAIRS: ");
        System.out.println("======================");
        for (String x : keys){
            System.out.println(x + " - " + capitals.get(x));
        }


    }
}
