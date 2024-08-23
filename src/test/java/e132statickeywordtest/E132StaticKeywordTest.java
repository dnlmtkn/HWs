package e132statickeywordtest;

import org.example.e132.E132StaticKeyword;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class E132StaticKeywordTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testMainMethodOutput() {
        E132StaticKeyword.main(new String[]{}); // Execute the main method to generate output
        String expectedOutput =
                "-9 -8 -7 -6 " + System.lineSeparator() +
                        "-6 -5 -4 -3 " + System.lineSeparator() +
                        "-9 -7 -5 -3 " + System.lineSeparator();
        assertEquals("The output from main does not match the expected output", expectedOutput, outContent.toString());
    }
}

