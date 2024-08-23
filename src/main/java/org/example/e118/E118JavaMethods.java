package org.example.e118;

public class E118JavaMethods {

    String spaceOut(String s) {
        String spaceS = "";
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        return spaceS;
    }

    public static void main(String[] args) {

        E118JavaMethods o = new E118JavaMethods();
        o.spaceOut("technology");
    }
}