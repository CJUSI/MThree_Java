package com.sg.intermediate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comparators extends Collections {

    public Comparators(String char1, String char2, String char3) {
        this.char1 = char1;
        this.char2 = char2;
        this.char3 = char3;
    }

    String char1;
    String char2;
    String char3;

    public static void main(String[] args) {
        List<Comparators> collection = new ArrayList<>();

        collection.add(new Comparators("a", "b", "c"));
        collection.add(new Comparators("a", "c", "b"));
        collection.add(new Comparators("b", "a", "c"));
        collection.add(new Comparators("a", "a", "c"));
        collection.add(new Comparators("c", "a", "c"));


        //print sort from my method char 1- char 2 - char 3
        collection.sort();

    }


}

