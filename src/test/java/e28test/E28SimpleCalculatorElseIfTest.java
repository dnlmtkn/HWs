package e28test;


import org.example.e28.E28SimpleCalculatorElseIf;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class E28SimpleCalculatorElseIfTest {

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
    void testProduct() {

        // Simulate the program with an operator that should result in "The product is: 50"
        String simulatedInput = "*\n5\n10\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E28SimpleCalculatorElseIf.main(new String[]{});
        String expectedOutput = "The product is: 50.0" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program performs the correct arithmetic operation based on the operator.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
