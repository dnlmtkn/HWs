package e3test;

import org.example.e3.E3CreatingVariableAndPrinting;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class E3CreatingVariableAndPrintingTest {

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
    void testOutput() {
        E3CreatingVariableAndPrinting.main(new String[]{});
        String expectedOutput = "99999.99false";

        // Adding a detailed failure message
        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program prints the value of 'money' followed by 'myBoolean' on the same line.";

        assertEquals(expectedOutput, outContent.toString().trim(), failureMessage);
    }
}
