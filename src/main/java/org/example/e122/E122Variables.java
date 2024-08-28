package org.example.e122;

public class E122Variables {
    // Declare 3 instance variables: name of the countryName, capital, and populationSize
    String countryName;
    String capital;
    int populationSize;

    // Create a method to display values of instance variables

    void display(){
        System.out.println("The capital of "+countryName+" is "+capital+" and population is "+populationSize);
    }

    public static void main(String[] args) {
        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Execute the method to display values for the first instance
        // Assign values to variables for the second instance
        // Execute the method to display values for the second instance

        E122Variables c1=new E122Variables();
        c1.countryName="USA";
        c1.capital="Washington DC";
        c1.populationSize=330000000;
        c1.display();

    }
}
