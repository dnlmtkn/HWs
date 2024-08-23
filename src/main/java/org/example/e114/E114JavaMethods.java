package org.example.e114;

public class E114JavaMethods {

    void multiply(int a, int b) {
        System.out.println("Multiplication " + a * b);
    }

    void add(int a, int b) {
        System.out.println("Addition " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Subtraction " + (a - b));
    }

    public static void main(String[] args) {
        E114JavaMethods o = new E114JavaMethods();
        o.add(20, 10);
        o.multiply(2, 15);
        o.subtract(40, 20);

    }
}
