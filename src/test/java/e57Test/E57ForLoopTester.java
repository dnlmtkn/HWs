package e57Test;

import org.example.e57.E57ForLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E57ForLoopTester {

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
        E57ForLoop.main(new String[]{});
        String expectedOutput = "5" + System.lineSeparator() +
                                "7" + System.lineSeparator() +
                                "9" + System.lineSeparator() +
                                "11" + System.lineSeparator() +
                                "13" + System.lineSeparator() +
                                "15" + System.lineSeparator() +
                                "17" + System.lineSeparator() +
                                "19" + System.lineSeparator() +
                                "21" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the for loop.\n" +
                "Please ensure that your program correctly uses the for loop to print odd numbers from 5 to 21.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
