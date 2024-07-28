package e85NestedForLoopTest;

import org.example.e85.E85NestedForLoops;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E85NestedForLoopsTester {

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
    void testNumberPattern() {
        E85NestedForLoops.main(new String[]{});
        String expectedOutput = "1 " + System.lineSeparator() +
                                "1 2 " + System.lineSeparator() +
                                "1 2 3 " + System.lineSeparator() +
                                "1 2 3 4 " + System.lineSeparator() +
                                "1 2 3 4 5 " + System.lineSeparator() +
                                "1 2 3 4 5 6 " + System.lineSeparator() +
                                "1 2 3 4 5 6 7 " + System.lineSeparator() +
                                "1 2 3 4 5 6 " + System.lineSeparator() +
                                "1 2 3 4 5 " + System.lineSeparator() +
                                "1 2 3 4 " + System.lineSeparator() +
                                "1 2 3 " + System.lineSeparator() +
                                "1 2 " + System.lineSeparator() +
                                "1 " + System.lineSeparator();

        String failureMessage = "The output does not match the expected number pattern.\n" +
                "Please ensure that your program correctly uses nested loops to print the pattern.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
