package e133statickeywordtest;

import org.example.e133.E133StaticKeyword;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
public class E133StaticKeywordTest {

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
    public void testMainMethodOutput() {
        // Execute the main method to generate output
        E133StaticKeyword.main(new String[]{});
        // Construct the expected output string based on the hardcoded examples in the main method
        String expectedOutput = "3" + System.lineSeparator() + "6" + System.lineSeparator();
        // Assert that the captured output matches the expected output
        assertEquals("The output from main does not match the expected output", expectedOutput, outContent.toString());
    }
}