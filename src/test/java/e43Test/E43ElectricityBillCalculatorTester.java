package e43Test;

import org.example.e43.E43SwitchStatment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E43ElectricityBillCalculatorTester {

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
    void testLowUsage() {
        String simulatedInput = "50\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E43SwitchStatment.main(new String[]{});
        String expectedOutput = "Enter your electricity usage in kWh" + System.lineSeparator() +
                                "50" + System.lineSeparator() +
                                "Your electricity bill is $6.0" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for low usage.\n" +
                "Please ensure that your program captures the input correctly and calculates the bill.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testMediumUsage() {
        String simulatedInput = "150\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E43SwitchStatment.main(new String[]{});
        String expectedOutput = "Enter your electricity usage in kWh" + System.lineSeparator() +
                                "150" + System.lineSeparator() +
                                "Your electricity bill is $22.5" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for medium usage.\n" +
                "Please ensure that your program captures the input correctly and calculates the bill.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testHighUsage() {
        String simulatedInput = "350\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E43SwitchStatment.main(new String[]{});
        String expectedOutput = "Enter your electricity usage in kWh" + System.lineSeparator() +
                                "350" + System.lineSeparator() +
                                "Your electricity bill is $87.5" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for high usage.\n" +
                "Please ensure that your program captures the input correctly and calculates the bill.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testInvalidUsage() {
        String simulatedInput = "-10\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E43SwitchStatment.main(new String[]{});
        String expectedOutput = "Enter your electricity usage in kWh" + System.lineSeparator() +
                                "-10" + System.lineSeparator() +
                                "Invalid usage entered" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for invalid usage.\n" +
                "Please ensure that your program captures the input correctly and handles invalid usage.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
