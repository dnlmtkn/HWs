package org.example.e128;

public class E128StaticKeyword {


    static String mixString (String s1, String s2){
        if (s1.length()==s2.length()){
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    System.out.print(s1.indexOf(i)+s2.indexOf(j));
                }
            }
        }else{
            System.out.println("The strings should be the same length");
        }
        String res="";
        return res;
    }


    public static void main(String[] args) {

        E128StaticKeyword o=new E128StaticKeyword();
        o.mixString("12345","abcde");

    }

}