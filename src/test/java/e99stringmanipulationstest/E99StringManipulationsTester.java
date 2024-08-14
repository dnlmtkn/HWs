package e99stringmanipulationstest;

import org.example.e99.E99StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E99StringManipulationsTester {

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
    void testPalindromeChecker() {
        // Test case for racecar
        String input = "racecar";
        Scanner scanner = new Scanner(input);
        E99StringManipulations.main(new String[]{});
        String expectedOutput = "true" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());

        // Test case for hello
        input = "hello";
        scanner = new Scanner(input);
        E99StringManipulations.main(new String[]{});
        expectedOutput = "false" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }
}
