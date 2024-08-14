package e101stringmanipulationstest;

import org.example.e101.E101StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E101StringManipulationsTester {

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
    void testPrintEveryOtherLetter() {
        // Test case for "hello"
        String input = "hello";
        Scanner scanner = new Scanner(input);
        E101StringManipulations.main(new String[]{});
        String expectedOutput = "In:" + System.lineSeparator() +
                                "hlo" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());

        // Test case for "SSyynnttaaxxTTeecchhnnoollooggiieess"
        input = "SSyynnttaaxxTTeecchhnnoollooggiieess";
        scanner = new Scanner(input);
        E101StringManipulations.main(new String[]{});
        expectedOutput = "In:" + System.lineSeparator() +
                         "SyntaxTechnologies" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }
}
