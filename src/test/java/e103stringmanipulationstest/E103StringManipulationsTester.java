package e103stringmanipulationstest;

import org.example.e103.E103StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E103StringManipulationsTester {

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
    void testPrintEachCharacterSeparatedBySpacesHello() {
        // Simulate the input for "hello"
        String input = "hello";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);  // Set the input stream to simulate user input

        // Call the main method to run the program
        E103StringManipulations.main(new String[]{});

        // Expected output for "hello"
        String expectedOutput = "In:" + System.lineSeparator() +
                "h e l l o" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testPrintEachCharacterSeparatedBySpacesCovert() {
        // Simulate the input for "covert"
        String input = "covert";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);  // Set the input stream to simulate user input

        // Call the main method to run the program
        E103StringManipulations.main(new String[]{});

        // Expected output for "covert"
        String expectedOutput = "In:" + System.lineSeparator() +
                "c o v e r t" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testPrintEachCharacterSeparatedBySpacesBlasphemy() {
        // Simulate the input for "blasphemy"
        String input = "blasphemy";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);  // Set the input stream to simulate user input

        // Call the main method to run the program
        E103StringManipulations.main(new String[]{});

        // Expected output for "blasphemy"
        String expectedOutput = "In:" + System.lineSeparator() +
                "b l a s p h e m y" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString());
    }
}
