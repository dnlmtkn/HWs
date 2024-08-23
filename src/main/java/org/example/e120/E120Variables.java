package org.example.e120;

public class E120Variables {
    // Declare 3 instance variables: year, school name, and batch number
    int year;
    String school;
    int batchNumber;

    public static void main(String[] args) {
        // Access variables from the main method and assign specific values to them
        // Print values of your variables in the specified format
        //I am a student of batch 6 studying at Syntax in the year of 2020
        E120Variables o=new E120Variables();
        o.year=2020;
        o.school="Syntax";
        o.batchNumber=6;
        System.out.println("I am a student of batch "+o.batchNumber+" studying at "+o.school+" in the year of "+o.year);
    }
}
