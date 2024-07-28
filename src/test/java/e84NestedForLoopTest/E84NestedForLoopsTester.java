package e84NestedForLoopTest;

import org.example.e84.E84NestedForLoops;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E84NestedForLoopsTester {

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
    void testMultiplicationTablePattern() {
        E84NestedForLoops.main(new String[]{});
        String expectedOutput = "6 12 18 24 30 36 42 48 54 60 " + System.lineSeparator() +
                                "7 14 21 28 35 42 49 56 63 70 " + System.lineSeparator() +
                                "8 16 24 32 40 48 56 64 72 80 " + System.lineSeparator() +
                                "9 18 27 36 45 54 63 72 81 90 " + System.lineSeparator() +
                                "10 20 30 40 50 60 70 80 90 100 " + System.lineSeparator();

        String failureMessage = "The output does not match the expected multiplication table pattern.\n" +
                "Please ensure that your program correctly creates the 2D array, fills it with multiplication table values, and prints the pattern using nested loops.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
