package e101stringmanipulationstest;

import org.example.e101.E101StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E101StringManipulationsTester {

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
    void testPrintEveryOtherLetterHello() {
        // Simulate the input for "hello"
        String input = "hello";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);  // Set the input stream to simulate user input

        // Call the main method to run the program
        E101StringManipulations.main(new String[]{});

        // Expected output for "hello"
        String expectedOutput = "In: " + System.lineSeparator() +
                "hlo" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testPrintEveryOtherLetterComplex() {
        // Simulate the input for "SSyynnttaaxxTTeecchhnnoollooggiieess"
        String input = "SSyynnttaaxxTTeecchhnnoollooggiieess";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);  // Set the input stream to simulate user input

        // Call the main method to run the program
        E101StringManipulations.main(new String[]{});

        // Expected output for "SSyynnttaaxxTTeecchhnnoollooggiieess"
        String expectedOutput = "In: " + System.lineSeparator() +
                "SyntaxTechnologies" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString());
    }
}
