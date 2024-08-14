package e103stringmanipulationstest;

import org.example.e103.E103StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E103StringManipulationsTester {

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
    void testPrintEachCharacterSeparatedBySpaces() {
        // Test case for "hello"
        String input = "hello";
        Scanner scanner = new Scanner(input);
        E103StringManipulations.main(new String[]{});
        String expectedOutput = "In:" + System.lineSeparator() +
                                "h e l l o" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());

        // Test case for "covert"
        input = "covert";
        scanner = new Scanner(input);
        E103StringManipulations.main(new String[]{});
        expectedOutput = "In:" + System.lineSeparator() +
                         "c o v e r t" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());

        // Test case for "blasphemy"
        input = "blasphemy";
        scanner = new Scanner(input);
        E103StringManipulations.main(new String[]{});
        expectedOutput = "In:" + System.lineSeparator() +
                         "b l a s p h e m y" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }
}
