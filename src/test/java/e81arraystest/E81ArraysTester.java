package e81arraystest;

import org.example.e81.E81Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E81ArraysTester {

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
    void testEvenIndexAndEvenRowSum() {
        E81Arrays.main(new String[]{});
        String expectedOutput = "-4" + System.lineSeparator();

        String failureMessage = "The output does not match the expected sum for the numbers on even indexes and even rows in the 2D array.\n" +
                "Please ensure that your program correctly creates the 2D array, sums the numbers on even indexes and even rows, and prints the total sum.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
