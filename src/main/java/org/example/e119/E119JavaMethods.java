package org.example.e119;

public class E119JavaMethods {

    String censorLetter(String a){
        System.out.println(a.replace("e","*"));
        return a;
    }

    public static void main(String[] args) {

        E119JavaMethods o=new E119JavaMethods();
        System.out.println(o.censorLetter("test"));
    }

}
