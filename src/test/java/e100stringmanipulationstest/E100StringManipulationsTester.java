package e100stringmanipulationstest;

import org.example.e100.E100StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E100StringManipulationsTester {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));  // Redirect output stream to capture the output
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);  // Reset the original output stream
        System.setIn(System.in);  // Reset input stream to the original
        outContent.reset();  // Clear the output buffer between tests
    }

    @Test
    void testStringReversalManhattan() {
        // Simulate the input for "manhattan"
        String input = "manhattan";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);  // Set the input stream to simulate user input

        // Call the main method to run the program
        E100StringManipulations.main(new String[]{});

        // Expected output for "manhattan"
        String expectedOutput = "In: " + System.lineSeparator() +
                "nattahnam" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testStringReversalProcessor() {
        // Simulate the input for "processor"
        String input = "processor";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);  // Set the input stream to simulate user input

        // Call the main method to run the program
        E100StringManipulations.main(new String[]{});

        // Expected output for "processor"
        String expectedOutput = "In: " + System.lineSeparator() +
                "rossecorp" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testStringReversalRacecarTilde() {
        // Simulate the input for "racecar~~"
        String input = "racecar~~";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);  // Set the input stream to simulate user input

        // Call the main method to run the program
        E100StringManipulations.main(new String[]{});

        // Expected output for "racecar~~"
        String expectedOutput = "In: " + System.lineSeparator() +
                "~~racecar" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString());
    }
}
