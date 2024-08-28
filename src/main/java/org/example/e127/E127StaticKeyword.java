package org.example.e127;

import org.example.e126.E126Variables;

public class E127StaticKeyword {

    // Non-static method that prints a message
    // Static method that prints a message
void nonStaticMethod (){
    System.out.println("Programming is amazing.");
}
static void staticMethod (){
    System.out.println("Java is awesome.");
}
    // Main method to execute both methods
    public static void main(String[] args) {
        // Create an instance of the class to call the non-static method
        // Call non-static method
        E127StaticKeyword o = new E127StaticKeyword();
        o.nonStaticMethod();

        // Call the static method directly using the class name
        // Call static method
        E127StaticKeyword.staticMethod();


    }
    }

