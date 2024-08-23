package org.example.e109;

public class E109JavaMethods {

    void newLine() {
        System.out.println("newLine method implementation");
    }

    public static void main(String[] args) {

        E109JavaMethods o = new E109JavaMethods();

        for (int i = 0; i < 3; i++) {
            o.newLine();
        }
    }
}
