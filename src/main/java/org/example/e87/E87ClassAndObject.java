package org.example.e87;

public class E87ClassAndObject {
    public static void main(String[] args) {

        class Car {
            String carColor;
            int carYear;
            String carMake;
        }

        Car firstObject = new Car();

        firstObject.carColor = "Black";
        firstObject.carYear = 2019;
        firstObject.carMake = "BMW";

        Car secondObject = new Car();

        secondObject.carColor = "White";
        secondObject.carYear = 2018;
        secondObject.carMake = "Toyota";

        System.out.println("Car color is " + firstObject.carColor + " and car year is " + firstObject.carYear + " and car model is " + firstObject.carMake);
        System.out.println("Car color is " + secondObject.carColor + " and car year is " + secondObject.carYear + " and car model is " + secondObject.carMake);


    }
}
