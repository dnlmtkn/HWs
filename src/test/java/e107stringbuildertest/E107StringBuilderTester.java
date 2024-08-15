package e107stringbuildertest;

import org.example.e107.E107StringBuilder;  // Ensure this is the correct package and class path
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E107StringBuilderTester {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        // Redirect System.out to capture output
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        // Restore the original System.out after the test
        System.setOut(originalOut);
    }

    @Test
    void testStringBufferReverse() {
        // Call the main method of E107StringBuilder to run the program
        E107StringBuilder.main(new String[]{});

        // Expected output after reversing the string "Hello Friends"
        String expectedOutput = "sdneirF olleH" + System.lineSeparator();

        // Assert that the output matches the expected reversed result
        assertEquals(expectedOutput, outContent.toString(), "The output does not match the expected result. Ensure that you reverse the string 'Hello Friends' using the StringBuffer or StringBuilder class.");
    }
}
