package org.example.e134;

public class E134StaticKeyword {

    int countVowels (String s){

        int vow=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vow=vow+1;
            }
        }
        System.out.println(vow);
        int vowS=vow;
        return vowS;
    }

    public static void main(String[] args) {

        E134StaticKeyword o=new E134StaticKeyword();
        o.countVowels("happy friday! i love weekends");

    }
}

