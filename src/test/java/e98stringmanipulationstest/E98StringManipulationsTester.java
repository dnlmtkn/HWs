package e98stringmanipulationstest;

import org.example.e98.E98StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E98StringManipulationsTester {

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
    void testStringManipulation() {
        E98StringManipulations.main(new String[]{});
        String expectedOutput = "Welcome Syntax family" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for the string manipulation.\n" +
                "Please ensure that your program correctly manipulates the given string to create the new string and prints the result.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
