package e58Test;

import org.example.e58.E58ForLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E58ForLoopTester {

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
    void testForLoop() {
        E58ForLoop.main(new String[]{});
        String expectedOutput = "Processing order #1" + System.lineSeparator() +
                "Processing order #2" + System.lineSeparator() +
                "Processing order #3" + System.lineSeparator() +
                "Processing order #4" + System.lineSeparator() +
                "Processing order #5" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the for loop.\n" +
                "Please ensure that your program correctly uses the for loop to print 'Processing order #' followed by the order number.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
