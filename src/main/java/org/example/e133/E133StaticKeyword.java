package org.example.e133;

public class E133StaticKeyword {

    static int countA(String s){
        int con=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a'||s.charAt(i)=='A'){
                con=con+1;
            }
        }
        System.out.println(con);
        int sum=con;
        return sum;

    }
    public static void main(String[] args) {

        E133StaticKeyword o=new E133StaticKeyword();
        E133StaticKeyword.countA("aaaaaaaaaaaa");

    }
}

