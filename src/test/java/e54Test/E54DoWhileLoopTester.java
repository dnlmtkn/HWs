package e54Test;

import org.example.e54.E54DoWhileLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E54DoWhileLoopTester {

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
        E54DoWhileLoop.main(new String[]{});
        String expectedOutput = "10" + System.lineSeparator() +
                                "9" + System.lineSeparator() +
                                "8" + System.lineSeparator() +
                                "7" + System.lineSeparator() +
                                "6" + System.lineSeparator() +
                                "5" + System.lineSeparator() +
                                "4" + System.lineSeparator() +
                                "3" + System.lineSeparator() +
                                "2" + System.lineSeparator() +
                                "1" + System.lineSeparator() +
                                "Countdown complete!" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the do-while loop.\n" +
                "Please ensure that your program correctly uses the do-while loop to create a countdown timer.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
