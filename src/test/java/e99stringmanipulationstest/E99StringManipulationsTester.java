package e99stringmanipulationstest;

import org.example.e99.E99StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E99StringManipulationsTester {

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
    void testRacecarPalindrome() {
        // Simulate the input for "racecar"
        String input = "racecar";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);  // Set the input stream to simulate user input

        // Call the main method to run the program
        E99StringManipulations.main(new String[]{});

        // Expected output for "racecar"
        String expectedOutput = "Please enter a string:" + System.lineSeparator() +
                "true" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testHelloNotPalindrome() {
        // Simulate the input for "hello"
        String input = "hello";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);  // Set the input stream to simulate user input

        // Call the main method to run the program
        E99StringManipulations.main(new String[]{});

        // Expected output for "hello"
        String expectedOutput = "Please enter a string:" + System.lineSeparator() +
                "false" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString());
    }
}
