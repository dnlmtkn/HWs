package e38Test;

import org.example.e38.E38LogicalOperators;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E38WeekendSubjectPlannerTester {

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
    void testNotWeekend() {
        String simulatedInput = "false\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E38LogicalOperators.main(new String[]{});
        String expectedOutput = "Is it weekend? (true/false)" + System.lineSeparator() +
                                "false" + System.lineSeparator() +
                                "Today you will be learning manual testing" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for not a weekend.\n" +
                "Please ensure that your program captures the input correctly and suggests the right subject.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testWeekend() {
        String simulatedInput = "true\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E38LogicalOperators.main(new String[]{});
        String expectedOutput = "Is it weekend? (true/false)" + System.lineSeparator() +
                                "true" + System.lineSeparator() +
                                "Today you will be learning Java" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for a weekend.\n" +
                "Please ensure that your program captures the input correctly and suggests the right subject.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
