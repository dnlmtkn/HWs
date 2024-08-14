package e102stringmanipulationstest;

import org.example.e102.E102StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E102StringManipulationsTester {

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
    void testPrintEachCharacter() {
        // Test case for "hello"
        String input = "hello";
        Scanner scanner = new Scanner(input);
        E102StringManipulations.main(new String[]{});
        String expectedOutput = "In:" + System.lineSeparator() +
                                "h" + System.lineSeparator() +
                                "e" + System.lineSeparator() +
                                "l" + System.lineSeparator() +
                                "l" + System.lineSeparator() +
                                "o" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());

        // Test case for "zimbabwe"
        input = "zimbabwe";
        scanner = new Scanner(input);
        E102StringManipulations.main(new String[]{});
        expectedOutput = "In:" + System.lineSeparator() +
                         "z" + System.lineSeparator() +
                         "i" + System.lineSeparator() +
                         "m" + System.lineSeparator() +
                         "b" + System.lineSeparator() +
                         "a" + System.lineSeparator() +
                         "b" + System.lineSeparator() +
                         "w" + System.lineSeparator() +
                         "e" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());

        // Test case for "wow!"
        input = "wow!";
        scanner = new Scanner(input);
        E102StringManipulations.main(new String[]{});
        expectedOutput = "In:" + System.lineSeparator() +
                         "w" + System.lineSeparator() +
                         "o" + System.lineSeparator() +
                         "w" + System.lineSeparator() +
                         "!" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }
}
