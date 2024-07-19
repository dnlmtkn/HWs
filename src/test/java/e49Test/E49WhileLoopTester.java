package e49Test;

import org.example.e49.E49WhileLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E49WhileLoopTester {

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
    void testWhileLoop() {
        E49WhileLoop.main(new String[]{});
        String expectedOutput = "Please confirm your order: Your order number is 12345" + System.lineSeparator() +
                                "Please confirm your order: Your order number is 12345" + System.lineSeparator() +
                                "Please confirm your order: Your order number is 12345" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the while loop.\n" +
                "Please ensure that your program correctly uses the while loop to confirm the order three times.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
