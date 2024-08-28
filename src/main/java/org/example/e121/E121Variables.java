package org.example.e121;

public class E121Variables {
    // Declare 3 instance variables: integer, double, and char
    int i;
    double d;
    char c;

    public static void main(String[] args) {

        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Print values of the first instance
        // Assign values to variables for the second instance
        // Print values of the second instance

        E121Variables c=new E121Variables();
        c.i=10;
        c.d=10.23;
        c.c='a';
        System.out.println(c.i);
        System.out.println(c.d);
        System.out.println(c.c);

        E121Variables c1=new E121Variables();
        c.i=100;
        c.d=100.23;
        c.c='s';
        System.out.println(c.i);
        System.out.println(c.d);
        System.out.println(c.c);
    }
}
