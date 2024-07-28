package e79arraystest;

import org.example.e79.E79Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E79ArraysTester {

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
    void testRowSums() {
        E79Arrays.main(new String[]{});
        String expectedOutput = "4" + System.lineSeparator() +
                                "6" + System.lineSeparator() +
                                "11" + System.lineSeparator() +
                                "3" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the row sums of the 2D array.\n" +
                "Please ensure that your program correctly creates the 2D array, calculates the sum of each row, and prints the values.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
