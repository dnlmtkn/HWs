package e33test;

import org.example.e33.E33NestedIfAndScanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E33NumberClassificationTester {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testOddAndJustRight() {
        String simulatedInput = "33\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E33NestedIfAndScanner.main(new String[]{});
        String expectedOutput = "Please enter a number" + System.lineSeparator() +
                                "33" + System.lineSeparator() +
                                "Value is odd" + System.lineSeparator() +
                                "Odd value is just right" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for an odd number that is just right.\n" +
                "Please ensure that your program captures the input correctly and classifies the number as odd and just right.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testEvenAndLarge() {
        String simulatedInput = "1200\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E33NestedIfAndScanner.main(new String[]{});
        String expectedOutput = "Please enter a number" + System.lineSeparator() +
                                "1200" + System.lineSeparator() +
                                "Value is even" + System.lineSeparator() +
                                "Even value is large" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for an even number that is large.\n" +
                "Please ensure that your program captures the input correctly and classifies the number as even and large.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
