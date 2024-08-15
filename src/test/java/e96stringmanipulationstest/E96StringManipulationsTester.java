package e96stringmanipulationstest;

import org.example.e96.E96StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E96StringManipulationsTester {

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
        outContent.reset();  // Reset the output content buffer between tests
    }

    @Test
    void testJavaLanguageDescription() {
        // Test case for Java
        String input = "Java";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);  // Redirect input stream to simulate user input

        // Call the main method to run the program
        E96StringManipulations.main(new String[]{});

        // Expected output for "Java"
        String expectedOutput = "Please enter a programming language:" + System.lineSeparator() +
                "Java is a programming language" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testPythonLanguageDescription() {
        // Test case for Python
        String input = "Python";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);  // Redirect input stream to simulate user input

        // Call the main method to run the program
        E96StringManipulations.main(new String[]{});

        // Expected output for "Python"
        String expectedOutput = "Please enter a programming language:" + System.lineSeparator() +
                "Doesn't match any programming language" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString());
    }
}
