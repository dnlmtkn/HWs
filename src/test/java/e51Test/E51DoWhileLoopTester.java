package e51Test;

import org.example.e51.E51DoWhileLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E51DoWhileLoopTester {

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
        E51DoWhileLoop.main(new String[]{});
        String expectedOutput = "10" + System.lineSeparator() +
                                "11" + System.lineSeparator() +
                                "12" + System.lineSeparator() +
                                "13" + System.lineSeparator() +
                                "14" + System.lineSeparator() +
                                "15" + System.lineSeparator() +
                                "16" + System.lineSeparator() +
                                "17" + System.lineSeparator() +
                                "18" + System.lineSeparator() +
                                "19" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the do-while loop.\n" +
                "Please ensure that your program correctly uses the do-while loop to print the numbers from 10 to 19.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
