package org.example.e113;

public class E113JavaMethods {

    void printTime(int hours, int minutes) {
        System.out.println(hours + ":" + minutes);
    }

    public static void main(String[] args) {

        E113JavaMethods o = new E113JavaMethods();
        o.printTime(11, 30);


    }
}
