package org.example.e103;

import java.util.Scanner;

public class E103StringManipulations {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("In:");
        String inp= scan.next();

        for (int i = 0; i < inp.length(); i++) {
            System.out.print(inp.charAt(i)+" ");

        }

    }
}
