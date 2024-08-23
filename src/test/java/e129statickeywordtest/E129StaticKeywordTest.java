package e129statickeywordtest;

import org.example.e129.E129StaticKeyword;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E129StaticKeywordTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirect System.out to capture the console output
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restore System.out after the test
        System.setOut(originalOut);
    }

    @Test
    public void testDisplayOutput() {
        // Execute the main method which in turn calls the display method
        E129StaticKeyword.main(new String[]{});
        // Construct the expected output string
        String expectedOutput = "Morocco located on Africa continent" + System.lineSeparator();
        // Assert that the captured output matches the expected output
        assertEquals("The output does not match the expected message", expectedOutput, outContent.toString());
    }
}