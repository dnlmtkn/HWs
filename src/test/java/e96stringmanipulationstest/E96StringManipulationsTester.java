package e96stringmanipulationstest;

import org.example.e96.E96StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E96StringManipulationsTester {

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
    void testLanguageDescription() {
        // Test case for Java
        String input = "Java";
        Scanner scanner = new Scanner(input);
        E96StringManipulations.main(new String[]{});
        String expectedOutput = "Please enter a programming language:" + System.lineSeparator() +
                                "Java is a programming language" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());

        // Test case for Python
        input = "Python";
        scanner = new Scanner(input);
        E96StringManipulations.main(new String[]{});
        expectedOutput = "Please enter a programming language:" + System.lineSeparator() +
                         "Doesn't match any programming language" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }
}
