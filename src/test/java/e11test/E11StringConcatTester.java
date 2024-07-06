package e11test;

import org.example.e11.E11StringConcatenation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class E11StringConcatTester {


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
        E11StringConcatenation.main(new String[]{});
        String expectedOutput = "syntaxtechs.com" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program creates a variable with the value 'syntax',\n" +
                "creates a variable with the value 'techs.com', and prints them concatenated.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }


}
