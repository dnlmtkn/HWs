package e42Test;

import org.example.e42.E42SwitchClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E42DayOfWeekActivityPlannerTester {

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
    void testMonday() {
        String simulatedInput = "1\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E42SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)" + System.lineSeparator() +
                                "1" + System.lineSeparator() +
                                "Activity: Go to the gym" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Monday.\n" +
                "Please ensure that your program captures the input correctly and suggests the right activity.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testFriday() {
        String simulatedInput = "5\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E42SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)" + System.lineSeparator() +
                                "5" + System.lineSeparator() +
                                "Activity: Movie night" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Friday.\n" +
                "Please ensure that your program captures the input correctly and suggests the right activity.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testSunday() {
        String simulatedInput = "7\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E42SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)" + System.lineSeparator() +
                                "7" + System.lineSeparator() +
                                "Activity: Relax and recharge" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Sunday.\n" +
                "Please ensure that your program captures the input correctly and suggests the right activity.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testInvalidDay() {
        String simulatedInput = "8\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E42SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)" + System.lineSeparator() +
                                "8" + System.lineSeparator() +
                                "Invalid day entered" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for an invalid day.\n" +
                "Please ensure that your program captures the input correctly and handles invalid days of the week.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
