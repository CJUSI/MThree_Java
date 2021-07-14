package com.sg.intermediate.equalsmethods;

public class compareEquals {

    public static void main(String[] args) {

        System.out.println("Creating Strings through normal Initialization: ");
        String equiv = "Hello";
        String equiv2 = "Hello";
        System.out.println(" .equals 'Hello' and 'Hello': " + equiv.equals(equiv2));
        System.out.println(" == 'Hello' and 'Hello': " + (equiv == equiv2));

        System.out.println("Create strings using new() operator: ");
        String newstring1 = new String("Hello");
        String newstring2 = new String("Hello");
        System.out.println(" .equals 'Hello' and 'Hello': " + newstring1.equals(newstring2));
        System.out.println(" == 'Hello' and 'Hello': " + (newstring1 == newstring2));

        int newint1 = 150;
        int newint2 = 150;

        System.out.println(10==15);
        System.out.println(newint1 == newint2);







    }
}
