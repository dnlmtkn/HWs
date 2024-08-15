package e95stringmanipulationstest;

import org.example.e95.E95StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E95StringManipulationsTester {

    // Capturing output stream
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    // Simulated input stream
    private ByteArrayInputStream inContent;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));  // Redirect output stream to outContent
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);  // Reset the original output stream
        System.setIn(System.in);  // Reset input stream to the original
    }

    @Test
    void testExtractFirst3Letters() {
        // Simulate the input "banana"
        String input = "banana";
        inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        // Simulate the main method execution
        E95StringManipulations.main(new String[]{});

        // Expected output based on the input "banana"
        String expectedOutput = "Please enter a word: The first 3 letters of banana is ban" + System.lineSeparator();

        // Custom failure message if the test doesn't pass
        String failureMessage = "The output does not match the expected results for the substring extraction.\n" +
                "Please ensure that your program correctly reads the input, extracts the substring, and prints the result.";

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
