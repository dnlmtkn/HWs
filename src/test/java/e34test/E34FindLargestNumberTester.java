package e34test;

import org.example.e34.E34NestedIfAndScanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E34FindLargestNumberTester {

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
    void testLargestNumber() {
        String simulatedInput = "4 5 14\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E34NestedIfAndScanner.main(new String[]{});
        String expectedOutput = "Please enter 3 distinct numbers separated by spaces" + System.lineSeparator() +
                "The largest number is 14" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for finding the largest number.\n" +
                "Please ensure that your program captures the input correctly and finds the largest number using nested if-else conditions.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testLargestNumberWithDifferentInput() {
        String simulatedInput = "20 10 15\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E34NestedIfAndScanner.main(new String[]{});
        String expectedOutput = "Please enter 3 distinct numbers separated by spaces" + System.lineSeparator() +
                "The largest number is 20" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for finding the largest number with different input.\n" +
                "Please ensure that your program captures the input correctly and finds the largest number using nested if-else conditions.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
