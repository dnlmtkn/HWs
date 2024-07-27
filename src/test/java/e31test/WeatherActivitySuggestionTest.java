package e31test;

import org.example.e31.E31NestedIfAndScanner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WeatherActivitySuggestionTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final String lineSeparator = System.lineSeparator();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testSunnyAndHot() {
        String input = "true" + lineSeparator + "90" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E31NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Is it sunny outside? (true/false)" + lineSeparator +
                "It is a sunny day, I should go somewhere!" + lineSeparator +
                "What is the temperature outside?" + lineSeparator +
                "I am going to the beach!" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testSunnyAndCool() {
        String input = "true" + lineSeparator + "75" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E31NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Is it sunny outside? (true/false)" + lineSeparator +
                "It is a sunny day, I should go somewhere!" + lineSeparator +
                "What is the temperature outside?" + lineSeparator +
                "I am going to the park!" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testNotSunny() {
        String input = "false" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E31NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Is it sunny outside? (true/false)" + lineSeparator +
                "I stay home and practice Java." + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testEdgeCase_Temperature85() {
        String input = "true" + lineSeparator + "85" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E31NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Is it sunny outside? (true/false)" + lineSeparator +
                "It is a sunny day, I should go somewhere!" + lineSeparator +
                "What is the temperature outside?" + lineSeparator +
                "I am going to the park!" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }
}