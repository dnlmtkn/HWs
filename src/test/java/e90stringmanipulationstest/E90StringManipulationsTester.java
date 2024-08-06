package e90stringmanipulationstest;

import org.example.e90.E90StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E90StringManipulationsTester {

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
    void testStringIsEmpty() {
        E90StringManipulations.main(new String[]{});
        String expectedOutput = "false" + System.lineSeparator() +
                                "true" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for the empty string checks.\n" +
                "Please ensure that your program correctly assigns the string values, checks if they are empty, and prints the results.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
