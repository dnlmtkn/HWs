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

class E43SwitchStatementTest {

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
    void testCase0To100() {
        String simulatedInput = "50\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E43SwitchStatment.main(new String[]{});
        String expectedOutput = "Enter your electricity usage in kWh" + System.lineSeparator() +
                "Your electricity bill is $6.0" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for usage 0-100 kWh.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testCase101To200() {
        String simulatedInput = "150\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E43SwitchStatment.main(new String[]{});
        String expectedOutput = "Enter your electricity usage in kWh" + System.lineSeparator() +
                "Your electricity bill is $22.5" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for usage 101-200 kWh.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testCase201To300() {
        String simulatedInput = "250\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E43SwitchStatment.main(new String[]{});
        String expectedOutput = "Enter your electricity usage in kWh" + System.lineSeparator() +
                "Your electricity bill is $50.0" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for usage 201-300 kWh.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testCase301AndAbove() {
        String simulatedInput = "350\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E43SwitchStatment.main(new String[]{});
        String expectedOutput = "Enter your electricity usage in kWh" + System.lineSeparator() +
                "Your electricity bill is $87.5" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for usage 301 kWh and above.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

}