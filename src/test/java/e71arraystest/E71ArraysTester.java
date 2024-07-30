package e71arraystest;

import org.example.e71.E71Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E71ArraysTester {

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
    void testArrayValues() {
        E71Arrays.main(new String[]{});
        String expectedOutput = "78 55 77 " ;

        String failureMessage = "The output does not match the expected values for the array.\n" +
                "Please ensure that your program correctly creates the array and extracts the specific values.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
