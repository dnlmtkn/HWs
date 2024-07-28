package e75arraystest;

import org.example.e75.E75Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E75ArraysTester {

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
    void test2DArrayValues() {
        E75Arrays.main(new String[]{});
        String expectedOutput = "1.4 2.0 3.3 2.0 " + System.lineSeparator() +
                                "4.0 1.5 6.1 1.0 " + System.lineSeparator() +
                                "1.2 3.1 4.0 1.6 " + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the 2D array.\n" +
                "Please ensure that your program correctly creates the 2D array and prints all values.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
