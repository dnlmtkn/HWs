package org.example.e123;

public class E123Variables {
    // Declare instance variables to hold integer, String, double, boolean, and float values
    int myInt;
    String myString;
    double myDouble;
    boolean myBoolean;
    float myFloat;


    public static void main(String[] args) {
        // Create an instance of the class
        // Access instance variables and print them without assigning any values
        // Print the default values of the instance variables

        E123Variables c=new E123Variables();
        System.out.println(c.myInt);
        System.out.println(c.myString);
        System.out.println(c.myDouble);
        System.out.println(c.myBoolean);
        System.out.println(c.myFloat);

    }
}
