package e86classandobjecttest;

import org.example.e86.E86ClassAndObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E86ClassAndObjectTester {

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
        E86ClassAndObject.main(new String[]{});
        String expectedOutput = "Name is John and roll number is 2" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the class and object properties.\n" +
                "Please ensure that your program correctly creates the class, declares the variables, creates the object, assigns the values, and prints the values.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
