package e136accessmodifierstest;

import org.example.e136.E136AccessModifiers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E136AccessModifiersTest {

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
        E136AccessModifiers.main(new String[]{});
        String[] expectedOutputs = {
                "This is Private Method",
                "This is Default Method",
                "This is Protected Method",
                "This is Public Method"
        };
        String actualOutput = outContent.toString().trim();
        // Split by lines to compare each expected line with the actual output
        String[] actualOutputs = actualOutput.split(System.lineSeparator());
        assertEquals("Expected number of outputs does not match actual number", expectedOutputs.length, actualOutputs.length);
        for (int i = 0; i < expectedOutputs.length; i++) {
            assertEquals(expectedOutputs[i], actualOutputs[i].trim());
        }
    }
}

