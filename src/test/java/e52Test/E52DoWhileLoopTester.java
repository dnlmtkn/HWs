package e52Test;

import org.example.e52.E52DoWhileLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E52DoWhileLoopTester {

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
    void testDoWhileLoop() {
        E52DoWhileLoop.main(new String[]{});
        String expectedOutput = "Hello World!" + System.lineSeparator() +
                                "Hello World!" + System.lineSeparator() +
                                "Hello World!" + System.lineSeparator() +
                                "Hello World!" + System.lineSeparator() +
                                "Hello World!" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the do-while loop.\n" +
                "Please ensure that your program correctly uses the do-while loop to print 'Hello World!' five times.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
