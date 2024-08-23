package e128statickeywordtest;

import org.example.e128.E128StaticKeyword;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E128StaticKeywordTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirects System.out to capture output
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restores System.out to its original state
        System.setOut(originalOut);
    }

    @Test
    public void testMainOutput() {
        // Executes the main method of Problem_128 to capture its output
        E128StaticKeyword.main(new String[]{});
        // Expected output for the hardcoded inputs within the main method
        String expectedOutput = "1a2b3c4d5e" + System.lineSeparator();
        // Asserts that the captured output matches the expected output
        assertEquals("The output from main does not match the expected output", expectedOutput, outContent.toString());
    }
}