package e105stringmanipulationstest;

import org.example.e105.E105StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E105StringManipulationsTester {

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
    void testPrintOnlyVowelsHowdyho() {
        // Simulate the input for "howdyho"
        String input = "howdyho";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);  // Set the input stream to simulate user input

        // Call the main method to run the program
        E105StringManipulations.main(new String[]{});

        // Expected output for "howdyho"
        String expectedOutput = "In:" + System.lineSeparator() +
                "oo" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testPrintOnlyVowelsHuehue() {
        // Simulate the input for "huehuehuehue"
        String input = "huehuehuehue";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);  // Set the input stream to simulate user input

        // Call the main method to run the program
        E105StringManipulations.main(new String[]{});

        // Expected output for "huehuehuehue"
        String expectedOutput = "In:" + System.lineSeparator() +
                "ueueueue" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testPrintOnlyVowelsPoopoo() {
        // Simulate the input for "poopoo what idk what im doing"
        String input = "poopoo what idk what im doing";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);  // Set the input stream to simulate user input

        // Call the main method to run the program
        E105StringManipulations.main(new String[]{});

        // Expected output for "poopoo what idk what im doing"
        String expectedOutput = "In:" + System.lineSeparator() +
                "ooooaiaioi" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString());
    }
}
