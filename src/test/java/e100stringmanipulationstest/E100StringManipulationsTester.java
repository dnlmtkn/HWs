package e100stringmanipulationstest;

import org.example.e100.E100StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E100StringManipulationsTester {

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
    void testStringReversal() {
        // Test case for manhattan
        String input = "manhattan";
        Scanner scanner = new Scanner(input);
        E100StringManipulations.main(new String[]{});
        String expectedOutput = "In:" + System.lineSeparator() +
                                "nattahnam" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());

        // Test case for processor
        input = "processor";
        scanner = new Scanner(input);
        E100StringManipulations.main(new String[]{});
        expectedOutput = "In:" + System.lineSeparator() +
                         "rossecorp" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());

        // Test case for racecar~~
        input = "racecar~~";
        scanner = new Scanner(input);
        E100StringManipulations.main(new String[]{});
        expectedOutput = "In:" + System.lineSeparator() +
                         "~~racecar" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }
}
