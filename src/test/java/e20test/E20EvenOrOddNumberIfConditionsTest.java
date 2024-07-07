package e20test;

import org.example.e20.E20EvenOrOddNumberIfConditions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E20EvenOrOddNumberIfConditionsTest {

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
    void testEvenNumber() {
        // Simulate the program with the number 10
        E20EvenOrOddNumberIfConditions.main(new String[]{});
        String expectedOutput = "The number is even." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program correctly identifies the number 10 as even.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
