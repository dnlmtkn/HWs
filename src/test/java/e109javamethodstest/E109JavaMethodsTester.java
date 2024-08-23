package e109javamethodstest;

import org.example.e109.E109JavaMethods;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E109JavaMethodsTester {

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
    void testNewLineMethodOutput() {
        E109JavaMethods.main(new String[]{});
        String expectedOutput = "newLine method implementation" + System.lineSeparator() +
                                "newLine method implementation" + System.lineSeparator() +
                                "newLine method implementation" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString(), "The output does not match the expected result. Ensure that you call the newLine method three times from the main method.");
    }
}
