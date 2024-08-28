package org.example.e131;

public class E131StaticKeyword {

    String thirdLetter(String s){
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(3));
        }
        String res="";
        return res;
    }
    public static void main(String[] args) {

        E131StaticKeyword o=new E131StaticKeyword();
        o.thirdLetter("Hello there");
    }
}
