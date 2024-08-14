package e95stringmanipulationstest;

import org.example.e95.E95StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E95StringManipulationsTester {

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
    void testExtractFirst3Letters() {
        String input = "banana";
        Scanner scanner = new Scanner(input);
        E95StringManipulations.main(new String[]{});
        String expectedOutput = "The first 3 letters of banana is ban" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for the substring extraction.\n" +
                "Please ensure that your program correctly reads the input, extracts the substring, and prints the result.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
