package e33test;

import org.example.e33.E33NestedIfAndScanner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class NumberClassificationTest {

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
    public void testOddNumberLessThan1000() {
        String input = "33" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E33NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter a number" + lineSeparator +
                                "Value is odd" + lineSeparator +
                                "Odd value is just right" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testEvenNumberGreaterThan1000() {
        String input = "1200" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E33NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter a number" + lineSeparator +
                                "Value is even" + lineSeparator +
                                "Even value is large" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testOddNumberGreaterThan1000() {
        String input = "1001" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E33NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter a number" + lineSeparator +
                                "Value is odd" + lineSeparator +
                                "Odd value is large" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testEvenNumberLessThan1000() {
        String input = "500" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E33NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter a number" + lineSeparator +
                                "Value is even" + lineSeparator +
                                "Even value is just right" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testEdgeCaseNumber1000() {
        String input = "1000" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E33NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter a number" + lineSeparator +
                                "Value is even" + lineSeparator +
                                "Even value is just right" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }
}