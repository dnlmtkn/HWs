package e80arraystest;

import org.example.e80.E80Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E80ArraysTester {

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
    void testNegativeAndOddCount() {
        E80Arrays.main(new String[]{});
        String expectedOutput = "3" + System.lineSeparator();

        String failureMessage = "The output does not match the expected count for the negative and odd elements in the 2D array.\n" +
                "Please ensure that your program correctly creates the 2D array, counts the negative and odd elements, and prints the total count.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
