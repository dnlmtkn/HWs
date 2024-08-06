package e87classandobjecttest;

import org.example.e87.E87ClassAndObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E87ClassAndObjectTester {

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
        E87ClassAndObject.main(new String[]{});
        String expectedOutput = "Car color is Black and car year is 2019 and car model is BMW" + System.lineSeparator() +
                                "Car color is White and car year is 2018 and car model is Toyota" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the class and object properties.\n" +
                "Please ensure that your program correctly creates the class, declares the variables, creates the objects, assigns the values, and prints the values.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
