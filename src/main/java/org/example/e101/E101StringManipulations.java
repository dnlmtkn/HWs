package org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("In: ");
        String inp = scan.next();


        for (int i = 0; i < inp.length(); i += 2) {
            System.out.print(inp.charAt(i));

        }


    }
}
