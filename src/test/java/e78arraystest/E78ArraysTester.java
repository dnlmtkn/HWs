package e78arraystest;

import org.example.e78.E78Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E78ArraysTester {

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
        E78Arrays.main(new String[]{});
        String expectedOutput = "-9" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the 2D array.\n" +
                "Please ensure that your program correctly creates the 2D array, calculates the sum of all elements, and prints it.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
