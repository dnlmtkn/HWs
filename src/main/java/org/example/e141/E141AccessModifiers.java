package org.example.e141;

public class E141AccessModifiers {

    public int maxValue (int [] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[i+1]){
                max=max+arr[i];
            }
        }
        System.out.println(max);
        return max;
    }
    public static void main(String[] args) {

        E141AccessModifiers o=new E141AccessModifiers();
        o.maxValue(new int[]{0, 2, 3, 4});

    }
}
