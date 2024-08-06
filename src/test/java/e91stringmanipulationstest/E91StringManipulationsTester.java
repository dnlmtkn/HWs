package e91stringmanipulationstest;

import org.example.e91.E91StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E91StringManipulationsTester {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testStringCaseConversion() {
        E91StringManipulations.main(new String[]{});
        String expectedOutput = "SYNTAX TECHNOLOGIES" + System.lineSeparator() +
                                "syntax technologies" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for the string case conversions.\n" +
                "Please ensure that your program correctly assigns the string values, converts the cases, and prints the results.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
