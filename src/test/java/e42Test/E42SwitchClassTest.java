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

class E42SwitchClassTest {

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
                "Activity: Go to the gym" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Monday.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testTuesday() {
        String simulatedInput = "2\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E42SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)" + System.lineSeparator() +
                "Activity: Attend a coding meetup" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Tuesday.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testWednesday() {
        String simulatedInput = "3\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E42SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)" + System.lineSeparator() +
                "Activity: Go for a mid-week run" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Wednesday.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testThursday() {
        String simulatedInput = "4\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E42SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)" + System.lineSeparator() +
                "Activity: Take a cooking class" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Thursday.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testFriday() {
        String simulatedInput = "5\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E42SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)" + System.lineSeparator() +
                "Activity: Movie night" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Friday.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testSaturday() {
        String simulatedInput = "6\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E42SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)" + System.lineSeparator() +
                "Activity: Family day" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Saturday.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testSunday() {
        String simulatedInput = "7\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E42SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)" + System.lineSeparator() +
                "Activity: Relax and recharge" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Sunday.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testInvalidDay() {
        String simulatedInput = "8\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E42SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)" + System.lineSeparator() +
                "Invalid day entered" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for an invalid day.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}