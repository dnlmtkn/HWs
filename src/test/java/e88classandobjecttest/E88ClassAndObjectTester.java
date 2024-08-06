package e88classandobjecttest;

import org.example.e88.E88ClassAndObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E88ClassAndObjectTester {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testClassAndObject() {
        E88ClassAndObject.main(new String[]{});
        String expectedOutput = "Husky can bark" + System.lineSeparator() +
                                "Husky can run" + System.lineSeparator() +
                                "Husky can play" + System.lineSeparator() +
                                "Bulldog can bark" + System.lineSeparator() +
                                "Bulldog can run" + System.lineSeparator() +
                                "Bulldog can play" + System.lineSeparator() +
                                "Labrador can bark" + System.lineSeparator() +
                                "Labrador can run" + System.lineSeparator() +
                                "Labrador can play" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the class and object properties.\n" +
                "Please ensure that your program correctly creates the class, declares the variables, creates the objects, assigns the values, and prints the values.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
