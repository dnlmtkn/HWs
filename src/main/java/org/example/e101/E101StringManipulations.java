package org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner inp = new Scanner(System.in);

        // Prompt the user to input a string
        System.out.print("In:");
        String word = inp.nextLine();

        // Use a for loop to iterate through the string and print every other letter
        for (int i = 0; i < word.length(); i += 2) {
            System.out.print(word.charAt(i));
        }
    }
}
