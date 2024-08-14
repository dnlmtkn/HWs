package e93stringmanipulationstest;

import org.example.e93.E93StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E93StringManipulationsTester {

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
    void testStringIndexOf() {
        E93StringManipulations.main(new String[]{});
        String expectedOutput = "4" + System.lineSeparator() +
                                "11" + System.lineSeparator() +
                                "6" + System.lineSeparator() +
                                "-1" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for the substring positions.\n" +
                "Please ensure that your program correctly assigns the string value, checks the positions, and prints the results.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
