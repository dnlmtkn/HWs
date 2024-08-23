package e130statickeywordtest;

import org.example.e130.E130StaticKeyword;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E130StaticKeywordTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirects System.out to capture the console output
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restores System.out after the test
        System.setOut(originalOut);
    }

    @Test
    public void testMysteryOutput() {
        // Execute the main method which in turn calls the mystery method
        E130StaticKeyword.main(new String[]{});
        // Constructs the expected output string
        String expectedOutput = "10 1 30 2 50 " + System.lineSeparator();
        // Asserts that the captured output matches the expected output
        assertEquals("The output from mystery does not match the expected output", expectedOutput.trim(), outContent.toString().trim());
    }
}