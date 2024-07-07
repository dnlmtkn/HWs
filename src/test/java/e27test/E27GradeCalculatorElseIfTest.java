package e27test;


import org.example.e27.E27GradeCalculatorElseIf;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E27GradeCalculatorElseIfTest {
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
    void testBGrade() {
        E27GradeCalculatorElseIf.main(new String[]{});
        String expectedOutput = "Your grade is: B" + System.lineSeparator();
        String failureMessage = "The output does not match the expected grade.\n" +
                "Please ensure that your program calculates and prints the correct grade.";
        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}