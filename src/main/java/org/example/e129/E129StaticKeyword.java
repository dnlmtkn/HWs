package org.example.e129;

public class E129StaticKeyword {

    static String country;
    static String continent;

    void res(){
        System.out.println(country+" located on "+continent+" continent");
    }

    public static void main(String[] args) {
        E129StaticKeyword o=new E129StaticKeyword();
        country="Morocco";
        continent="Africa";
        o.res();


    }
}
