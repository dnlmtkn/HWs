package e29test;

import org.example.e29.E30ClassifyAnimalsElseIf;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E29MultiplicationSignCheckerTester {

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
    void testPositiveProduct() {
        String simulatedInput = "3\n4\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E30ClassifyAnimalsElseIf.main(new String[]{});
        String expectedOutput = "Please enter the first number" + System.lineSeparator() +
                                "Please enter the second number" + System.lineSeparator() +
                                "true" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for a positive product.\n" +
                "Please ensure that your program captures the numbers correctly and checks if the product is positive.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testNegativeProduct() {
        String simulatedInput = "-2\n5\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E30ClassifyAnimalsElseIf.main(new String[]{});
        String expectedOutput = "Please enter the first number" + System.lineSeparator() +
                                "Please enter the second number" + System.lineSeparator() +
                                "false" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for a negative product.\n" +
                "Please ensure that your program captures the numbers correctly and checks if the product is negative.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
