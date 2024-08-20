package org.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("In: ");
        String inp = scan.next();

        for (int i = (inp.length() - 1); i <= inp.length() && i >= 0; i--) {
            System.out.print(inp.charAt(i));

        }


    }
}
