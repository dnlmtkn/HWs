package e32test;

import org.example.e32.E32NestedIfAndScanner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GenderAgeClassificationTest {

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
    public void testMaleAbove25() {
        String input = "M" + lineSeparator + "30" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E32NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter your gender: M or F" + lineSeparator +
                                "Please enter your age" + lineSeparator +
                                "Man" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMale25OrBelow() {
        String input = "M" + lineSeparator + "20" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E32NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter your gender: M or F" + lineSeparator +
                                "Please enter your age" + lineSeparator +
                                "Boy" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testFemaleAbove25() {
        String input = "F" + lineSeparator + "28" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E32NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter your gender: M or F" + lineSeparator +
                                "Please enter your age" + lineSeparator +
                                "Woman" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testFemale25OrBelow() {
        String input = "F" + lineSeparator + "18" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E32NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter your gender: M or F" + lineSeparator +
                                "Please enter your age" + lineSeparator +
                                "Girl" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testEdgeCaseMaleAge25() {
        String input = "M" + lineSeparator + "25" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E32NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter your gender: M or F" + lineSeparator +
                                "Please enter your age" + lineSeparator +
                                "Boy" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testEdgeCaseFemaleAge25() {
        String input = "F" + lineSeparator + "25" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E32NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter your gender: M or F" + lineSeparator +
                                "Please enter your age" + lineSeparator +
                                "Girl" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }
}