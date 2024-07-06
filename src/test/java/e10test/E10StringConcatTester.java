package e10test;

import org.example.e10.E10StringConcatenation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class E10StringConcatTester {


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
    void testStringConcatenation() {
        E10StringConcatenation.main(new String[]{});
        String expectedOutput = "Java is the #1 programming language" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program creates a variable with the value 'Java',\n" +
                "creates a variable with the value 'programming language', and prints them concatenated with the text ' is the #1 ' in between.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }


}
