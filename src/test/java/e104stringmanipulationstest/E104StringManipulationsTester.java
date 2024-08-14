package e104stringmanipulationstest;

import org.example.e104.E104StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E104StringManipulationsTester {

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
    void testPrintFirstThreeCharacters() {
        // Test case for input example
        String input = "John\nJane\nJimmy\nMike\nEmily\n";
        Scanner scanner = new Scanner(input);
        E104StringManipulations.main(new String[]{});
        String expectedOutput = "In:" + System.lineSeparator() +
                                "Joh" + System.lineSeparator() +
                                "Jan" + System.lineSeparator() +
                                "Jim" + System.lineSeparator() +
                                "Mik" + System.lineSeparator() +
                                "Emi" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }
}
