package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("In:");
        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            names[i] = scan.next();
        }

        for (String name : names) {
            System.out.println(name.substring(0, 3));
        }


    }
}


