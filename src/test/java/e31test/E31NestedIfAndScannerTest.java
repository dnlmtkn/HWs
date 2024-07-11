package e31test;

import org.example.e31.E31NestedIfAndScanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E31WeatherActivitySuggestionTester {

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
    void testSunnyAndBeach() {
        String simulatedInput = "true\n90\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E31NestedIfAndScanner.main(new String[]{});
        String expectedOutput = "Is it sunny outside? (true/false)" + System.lineSeparator() +
                "true" + System.lineSeparator() +
                "It is a sunny day, I should go somewhere!" + System.lineSeparator() +
                "What is the temperature outside?" + System.lineSeparator() +
                "90" + System.lineSeparator() +
                "I am going to the beach!" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for sunny weather and high temperature.\n" +
                "Please ensure that your program captures the input correctly and provides the correct activity suggestion.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testSunnyAndPark() {
        String simulatedInput = "true\n75\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E31NestedIfAndScanner.main(new String[]{});
        String expectedOutput = "Is it sunny outside? (true/false)" + System.lineSeparator() +
                "true" + System.lineSeparator() +
                "It is a sunny day, I should go somewhere!" + System.lineSeparator() +
                "What is the temperature outside?" + System.lineSeparator() +
                "75" + System.lineSeparator() +
                "I am going to the park!" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for sunny weather and moderate temperature.\n" +
                "Please ensure that your program captures the input correctly and provides the correct activity suggestion.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testNotSunny() {
        String simulatedInput = "false\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E31NestedIfAndScanner.main(new String[]{});
        String expectedOutput = "Is it sunny outside? (true/false)" + System.lineSeparator() +
                "false" + System.lineSeparator() +
                "I stay home and practice Java" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for not sunny weather.\n" +
                "Please ensure that your program captures the input correctly and provides the correct activity suggestion.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
