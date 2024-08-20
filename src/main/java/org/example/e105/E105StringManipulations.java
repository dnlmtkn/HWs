package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("In:");
        String inp = scan.nextLine();

        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == 'a') {
                System.out.print(inp.charAt(i));
            } else if (inp.charAt(i) == 'e') {
                System.out.print(inp.charAt(i));
            } else if (inp.charAt(i) == 'i') {
                System.out.print(inp.charAt(i));
            } else if (inp.charAt(i) == 'o') {
                System.out.print(inp.charAt(i));
            } else if (inp.charAt(i) == 'u') {
                System.out.print(inp.charAt(i));
            }
        }


    }
}
