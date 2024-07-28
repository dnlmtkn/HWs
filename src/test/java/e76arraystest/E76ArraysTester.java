package e76arraystest;

import org.example.e76.E76Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E76ArraysTester {

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
        E76Arrays.main(new String[]{});
        String expectedOutput = "2.8 4.0 6.6 4.0 " + System.lineSeparator() +
                                "8.0 3.0 12.2 2.0 " + System.lineSeparator() +
                                "2.4 6.2 8.0 3.2 " + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the 2D array.\n" +
                "Please ensure that your program correctly creates the 2D array, doubles each value, and prints all values.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
