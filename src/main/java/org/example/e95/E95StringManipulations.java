package org.example.e95;

import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input a string value
        System.out.println("Please enter a word:");

        // Read the input string
        String word = scan.next();

        // Extract the first 3 letters using the substring() method
        // Print the result in the specified format
        System.out.print("The first 3 letters of " + word + " is " + word.substring(0, 3));
    }
}
