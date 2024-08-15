package e106stringbuildertest;

import org.example.e106.E106StringBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E106StringBuilderTester {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));  // Redirect output to capture it for the test
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);  // Restore the original system output
    }

    @Test
    void testStringBuilderManipulation() {
        // Call the main method of E106StringBuilder to run the program
        E106StringBuilder.main(new String[]{});

        // Expected output after manipulation
        String expectedOutput = "HELLO WORLD" + System.lineSeparator();

        // Assert that the output matches the expected result
        assertEquals(expectedOutput, outContent.toString(), "The output does not match the expected result. Ensure that you append 'Hello' and 'World' and convert the result to uppercase.");
    }
}
