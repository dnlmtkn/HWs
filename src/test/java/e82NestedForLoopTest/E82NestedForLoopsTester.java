package e82NestedForLoopTest;

import org.example.e82.E82NestedForLoops;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E82NestedForLoopsTester {

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
    void testPatternOutput() {
        E82NestedForLoops.main(new String[]{});
        String expectedOutput = "* * * * * " + System.lineSeparator() +
                                "* * * * * " + System.lineSeparator() +
                                "* * * * * " + System.lineSeparator() +
                                "* * * * * " + System.lineSeparator() +
                                "* * * * * " + System.lineSeparator() +
                                "* * * * * " + System.lineSeparator();

        String failureMessage = "The output does not match the expected pattern.\n" +
                "Please ensure that your program correctly creates the 2D array and prints the pattern using nested loops.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
