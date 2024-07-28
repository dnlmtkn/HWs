package e63Test;

import org.example.e63.E63ForLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E63ForLoopTester {

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
    void testForLoop() {
        String simulatedInput = "3\n8\n5\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E63ForLoop.main(new String[]{});
        String expectedOutput = "In: 0 1 2 " + System.lineSeparator() +
                                "In: 0 1 2 3 4 5 6 7 " + System.lineSeparator() +
                                "In: 0 1 2 3 4 " + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the for loop.\n" +
                "Please ensure that your program correctly uses the for loop to print a series of numbers based on user input.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
