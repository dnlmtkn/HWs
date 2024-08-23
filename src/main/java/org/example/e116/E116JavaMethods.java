package org.example.e116;

public class E116JavaMethods {
    void bothEven(int a, int b) {
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {

        E116JavaMethods o = new E116JavaMethods();
        o.bothEven(10, 3);
    }
}
