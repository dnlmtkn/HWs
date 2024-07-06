package e15test;

import org.example.e15.E15TimeConversionModulus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class E15TimeConversionModulusTester {

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
    void testTimeConversion() {
        E15TimeConversionModulus.main(new String[]{});
        String expectedOutput = "125 minutes is equal to 2 hours and 5 minutes." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program declares the variable 'totalMinutes' and performs the division and modulus operations correctly.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
