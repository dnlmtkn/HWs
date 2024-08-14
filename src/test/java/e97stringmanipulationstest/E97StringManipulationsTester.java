package e97stringmanipulationstest;

import org.example.e97.E97StringManipulations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E97StringManipulationsTester {

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
    void testBrowserValidation() {
        // Test case for Chrome
        String input = "Chrome";
        Scanner scanner = new Scanner(input);
        E97StringManipulations.main(new String[]{});
        String expectedOutput = "Please enter a browser name:" + System.lineSeparator() +
                                "Proceed with Chrome browser" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());

        // Test case for Safari
        input = "Safari";
        scanner = new Scanner(input);
        E97StringManipulations.main(new String[]{});
        expectedOutput = "Please enter a browser name:" + System.lineSeparator() +
                         "Invalid browser" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }
}
