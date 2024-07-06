package e13test;

import org.example.e13.E13ShoppingCartCalculationArithmeticConcat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class E13ShoppingCartCalculationArithmeticConcatTester {

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
    void testShoppingCartCalculation() {
        E13ShoppingCartCalculationArithmeticConcat.main(new String[]{});
        String expectedOutput = "Total Cost: $90.0" + System.lineSeparator() +
                "Discount Amount: $9.0" + System.lineSeparator() +
                "Final Price: $81.0" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program declares the variables 'item1', 'item2', and 'item3' and performs the arithmetic operations correctly.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
