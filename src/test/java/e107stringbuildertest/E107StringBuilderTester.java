package e107stringbuildertest;

import org.example.e107.E107StringBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E107StringBuilderTester {

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
    void testStringBufferReverse() {
        E107StringBuilder.main(new String[]{});
        String expectedOutput = "sdneirF olleH" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString(), "The output does not match the expected result. Ensure that you reverse the string 'Hello Friends' using the StringBuffer class.");
    }
}
