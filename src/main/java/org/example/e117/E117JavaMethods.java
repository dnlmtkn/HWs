package org.example.e117;

public class E117JavaMethods {

    int sumEvenToX(int x) {
        int sum = 0;
        for (int i = 2; i <= x; i += 2) {
            sum = sum + i;
        }
        return sum;
    }


    public static void main(String[] args) {

        E117JavaMethods o=new E117JavaMethods();

        System.out.println(o.sumEvenToX(5));

    }
}