package org.example.e140;

public class E140AccessModifiers {

    String maxLength (String [] arr){
        String w="";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()>arr[i+1].length()){
                w=arr[i];
            }
        }
        System.out.println(w);
        return w;
    }

    public static void main(String[] args) {
/*
        E140AccessModifiers o=new E140AccessModifiers();
        o.maxLength(arr String []{"opa","ooppaa","oopa"});*/

    }
}
