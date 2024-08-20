package org.example.e88;

public class E88ClassAndObject {

    public static void main(String[] args) {

        class Dog {

            String breed;
            String name;
            String color;

            void bark() {
                System.out.println(breed + " can bark");
            }

            void run() {
                System.out.println(breed + " can run");
            }

            void play() {
                System.out.println(breed + " can play");
            }
        }

        Dog d1 = new Dog();
        d1.breed = "Husky";
        d1.name = "AnyName";
        d1.color = "AnyColor";

        Dog d2 = new Dog();
        d2.breed = "Bulldog";
        d2.name = "AnyName";
        d2.color = "AnyColor";

        Dog d3 = new Dog();
        d3.breed = "Labrador";
        d3.name = "AnyName";
        d3.color = "AnyColor";

        d1.bark();
        d1.run();
        d1.play();
        d2.bark();
        d2.run();
        d2.play();
        d3.bark();
        d3.run();
        d3.play();


    }
}
