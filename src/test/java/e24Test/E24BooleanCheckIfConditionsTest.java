package e24Test;

import org.example.e24.E24BooleanCheckIfConditions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E24BooleanCheckIfConditionsTest {

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
    void testBooleanCheck() {
        // Simulate the program with the boolean value true
        E24BooleanCheckIfConditions.main(new String[]{});
        String expectedOutput = "Java is fun!" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program correctly identifies the boolean value 'true'.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
