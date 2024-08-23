package org.example.e115;

public class E115JavaMethods {
    void convertToUpper(String word) {
        System.out.println(word.toUpperCase());
    }

    public static void main(String[] args) {

        E115JavaMethods o = new E115JavaMethods();
        o.convertToUpper("test");
    }
}
