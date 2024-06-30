package e4test;

import org.example.e4.E4CreatingVariablesAndPrinting;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class E4CreatingVariablesAndPrintingTest {

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
        E4CreatingVariablesAndPrinting.main(new String[]{});
        String expectedOutput = "*" + System.lineSeparator() +
                                "**" + System.lineSeparator() +
                                "***" + System.lineSeparator() +
                                "##" + System.lineSeparator() +
                                "#" + System.lineSeparator();

        // Adding a detailed failure message
        String failureMessage = "The output does not match the expected pattern.\n" +
                "Please ensure that your program prints the exact pattern as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
