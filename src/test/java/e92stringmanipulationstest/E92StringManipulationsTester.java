package e92stringmanipulationstest;

import org.example.e92.E92StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E92StringManipulationsTester {

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
    void testStringEndsWith() {
        E92StringManipulations.main(new String[]{});
        String expectedOutput = "true" + System.lineSeparator() +
                                "false" + System.lineSeparator() +
                                "false" + System.lineSeparator() +
                                "true" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for the string ending validations.\n" +
                "Please ensure that your program correctly assigns the string value, checks the endings, and prints the results.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
