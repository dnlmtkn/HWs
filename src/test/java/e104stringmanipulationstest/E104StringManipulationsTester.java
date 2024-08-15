package e104stringmanipulationstest;

import org.example.e104.E104StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E104StringManipulationsTester {

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
    void testPrintFirstThreeCharacters() {
        // Simulate the input for the provided test case
        String input = "John\nJane\nJimmy\nMike\nEmily\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);  // Set the input stream to simulate user input

        // Call the main method to run the program
        E104StringManipulations.main(new String[]{});

        // Expected output for the given input
        String expectedOutput = "In:" + System.lineSeparator() +
                "Joh" + System.lineSeparator() +
                "Jan" + System.lineSeparator() +
                "Jim" + System.lineSeparator() +
                "Mik" + System.lineSeparator() +
                "Emi" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString());
    }
}
