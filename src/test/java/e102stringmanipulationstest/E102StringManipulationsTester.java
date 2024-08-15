package e102stringmanipulationstest;

import org.example.e102.E102StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E102StringManipulationsTester {

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
    void testPrintEachCharacterHello() {
        // Simulate the input for "hello"
        String input = "hello";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);  // Set the input stream to simulate user input

        // Call the main method to run the program
        E102StringManipulations.main(new String[]{});

        // Expected output for "hello"
        String expectedOutput = "In:" + System.lineSeparator() +
                "h" + System.lineSeparator() +
                "e" + System.lineSeparator() +
                "l" + System.lineSeparator() +
                "l" + System.lineSeparator() +
                "o" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testPrintEachCharacterZimbabwe() {
        // Simulate the input for "zimbabwe"
        String input = "zimbabwe";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);  // Set the input stream to simulate user input

        // Call the main method to run the program
        E102StringManipulations.main(new String[]{});

        // Expected output for "zimbabwe"
        String expectedOutput = "In:" + System.lineSeparator() +
                "z" + System.lineSeparator() +
                "i" + System.lineSeparator() +
                "m" + System.lineSeparator() +
                "b" + System.lineSeparator() +
                "a" + System.lineSeparator() +
                "b" + System.lineSeparator() +
                "w" + System.lineSeparator() +
                "e" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testPrintEachCharacterWow() {
        // Simulate the input for "wow!"
        String input = "wow!";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);  // Set the input stream to simulate user input

        // Call the main method to run the program
        E102StringManipulations.main(new String[]{});

        // Expected output for "wow!"
        String expectedOutput = "In:" + System.lineSeparator() +
                "w" + System.lineSeparator() +
                "o" + System.lineSeparator() +
                "w" + System.lineSeparator() +
                "!" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString());
    }
}
