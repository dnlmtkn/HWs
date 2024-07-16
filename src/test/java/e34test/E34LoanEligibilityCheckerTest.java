package e34test;

import org.example.e35.E35LogicalOperators;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E34LoanEligibilityCheckerTest {

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
    void testLoanEligibilityNotEligible() {
        String simulatedInput = "true\n550\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E35LogicalOperators.main(new String[]{});
        String expectedOutput = "Do you need a loan? (true/false)" + System.lineSeparator() +
                "What is your credit score?" + System.lineSeparator() +
                "The eligibility is Not eligible" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for credit score below 600.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testLoanEligibilityMaybeEligible() {
        String simulatedInput = "true\n650\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E35LogicalOperators.main(new String[]{});
        String expectedOutput = "Do you need a loan? (true/false)" + System.lineSeparator() +
                "What is your credit score?" + System.lineSeparator() +
                "The eligibility is Maybe eligible" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for credit score between 600 and 700.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testLoanEligibilityEligible() {
        String simulatedInput = "true\n750\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E35LogicalOperators.main(new String[]{});
        String expectedOutput = "Do you need a loan? (true/false)" + System.lineSeparator() +
                "What is your credit score?" + System.lineSeparator() +
                "The eligibility is Eligible" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for credit score between 701 and 800.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testLoanEligibilityDefinitelyEligible() {
        String simulatedInput = "true\n850\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E35LogicalOperators.main(new String[]{});
        String expectedOutput = "Do you need a loan? (true/false)" + System.lineSeparator() +
                "What is your credit score?" + System.lineSeparator() +
                "The eligibility is Definitely eligible" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for credit score above 800.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testLoanEligibilityUnknown() {
        String simulatedInput = "false\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E35LogicalOperators.main(new String[]{});
        String expectedOutput = "Do you need a loan? (true/false)" + System.lineSeparator() +
                "The eligibility is Unknown" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values when no loan is needed.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}