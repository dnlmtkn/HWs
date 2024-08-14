package e105stringmanipulationstest;

import org.example.e105.E105StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E105StringManipulationsTester {

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
    void testPrintOnlyVowels() {
        // Test case for "howdyho"
        String input = "howdyho";
        Scanner scanner = new Scanner(input);
        E105StringManipulations.main(new String[]{});
        String expectedOutput = "In:" + System.lineSeparator() +
                                "oo" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());

        // Test case for "huehuehuehue"
        input = "huehuehuehue";
        scanner = new Scanner(input);
        E105StringManipulations.main(new String[]{});
        expectedOutput = "In:" + System.lineSeparator() +
                         "ueueueue" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());

        // Test case for "poopoo what idk what im doing"
        input = "poopoo what idk what im doing";
        scanner = new Scanner(input);
        E105StringManipulations.main(new String[]{});
        expectedOutput = "In:" + System.lineSeparator() +
                         "ooooaiaioi" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }
}
