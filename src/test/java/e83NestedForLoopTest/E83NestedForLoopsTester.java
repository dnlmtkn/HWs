package e83NestedForLoopTest;

import org.example.e83.E83NestedForLoops;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E83NestedForLoopsTester {

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
        E83NestedForLoops.main(new String[]{});
        String expectedOutput = "1 2 3 4 5 6 7 8 9 10 " + System.lineSeparator() +
                                "2 4 6 8 10 12 14 16 18 20 " + System.lineSeparator() +
                                "3 6 9 12 15 18 21 24 27 30 " + System.lineSeparator() +
                                "4 8 12 16 20 24 28 32 36 40 " + System.lineSeparator() +
                                "5 10 15 20 25 30 35 40 45 50 " + System.lineSeparator();

        String failureMessage = "The output does not match the expected multiplication table pattern.\n" +
                "Please ensure that your program correctly creates the 2D array, fills it with multiplication table values, and prints the pattern using nested loops.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
