package e32test;

import org.example.e32.E32NestedIfAndScanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E32GenderAgeClassificationTester {

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
    void testMan() {
        String simulatedInput = "M\n30\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E32NestedIfAndScanner.main(new String[]{});
        String expectedOutput = "Please enter your gender: M or F" + System.lineSeparator() +
                "M" + System.lineSeparator() +
                "Please enter your age" + System.lineSeparator() +
                "30" + System.lineSeparator() +
                "Man" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for an adult man.\n" +
                "Please ensure that your program captures the input correctly and classifies based on gender and age.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testBoy() {
        String simulatedInput = "M\n20\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E32NestedIfAndScanner.main(new String[]{});
        String expectedOutput = "Please enter your gender: M or F" + System.lineSeparator() +
                "M" + System.lineSeparator() +
                "Please enter your age" + System.lineSeparator() +
                "20" + System.lineSeparator() +
                "Boy" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for a young boy.\n" +
                "Please ensure that your program captures the input correctly and classifies based on gender and age.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testWoman() {
        String simulatedInput = "F\n28\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E32NestedIfAndScanner.main(new String[]{});
        String expectedOutput = "Please enter your gender: M or F" + System.lineSeparator() +
                "F" + System.lineSeparator() +
                "Please enter your age" + System.lineSeparator() +
                "28" + System.lineSeparator() +
                "Woman" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for an adult woman.\n" +
                "Please ensure that your program captures the input correctly and classifies based on gender and age.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testGirl() {
        String simulatedInput = "F\n18\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E32NestedIfAndScanner.main(new String[]{});
        String expectedOutput = "Please enter your gender: M or F" + System.lineSeparator() +
                "F" + System.lineSeparator() +
                "Please enter your age" + System.lineSeparator() +
                "18" + System.lineSeparator() +
                "Girl" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for a young girl.\n" +
                "Please ensure that your program captures the input correctly and classifies based on gender and age.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
