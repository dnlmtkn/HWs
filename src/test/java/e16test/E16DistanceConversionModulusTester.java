package e16test;

import org.example.e16.E16DistanceConversionModulus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class E16DistanceConversionModulusTester {

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
    void testDistanceConversion() {
        E16DistanceConversionModulus.main(new String[]{});
        String expectedOutput = "1850 meters is equal to 1 kilometers and 850 meters." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program declares the variable 'totalMeters' and performs the division and modulus operations correctly.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
