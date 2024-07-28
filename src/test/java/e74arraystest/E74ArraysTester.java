package e74arraystest;

import org.example.e74.E74Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E74ArraysTester {

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
    void testArrayValues() {
        String simulatedInput = "1\n2\n3\n4\n5\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E74Arrays.main(new String[]{});
        String expectedOutput = "10" + System.lineSeparator() +
                                "20" + System.lineSeparator() +
                                "30" + System.lineSeparator() +
                                "40" + System.lineSeparator() +
                                "50" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the array.\n" +
                "Please ensure that your program correctly reads the input, stores the values, multiplies them by 10, and prints the result.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
