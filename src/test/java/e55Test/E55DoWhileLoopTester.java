package e55Test;

import org.example.e55.E55DoWhileLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E55DoWhileLoopTester {

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
    void testDoWhileLoop() {
        String simulatedInput = "3\n5\n7\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E55DoWhileLoop.main(new String[]{});
        String expectedOutput = "Enter your favorite number:" + System.lineSeparator() +
                                "You entered: 3" + System.lineSeparator() +
                                "Enter your favorite number:" + System.lineSeparator() +
                                "You entered: 5" + System.lineSeparator() +
                                "Enter your favorite number:" + System.lineSeparator() +
                                "You entered: 7" + System.lineSeparator() +
                                "You've entered 7! Loop ends." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the do-while loop.\n" +
                "Please ensure that your program correctly uses the do-while loop to collect and print user input.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
