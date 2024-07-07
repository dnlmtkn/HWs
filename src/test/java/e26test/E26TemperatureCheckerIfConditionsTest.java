package e26test;


import org.example.e26.E26TemperatureCheckerIfConditions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E26TemperatureCheckerIfConditionsTest {

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
    void testWarmTemperature() {
        // Simulate the program with a temperature that should result in "It's warm outside."
        E26TemperatureCheckerIfConditions.main(new String[]{});
        String expectedOutput = "It's warm outside." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program checks the temperature and prints the correct message.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
