package e72arraystest;

import org.example.e72.E72Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E72ArraysTester {

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
    void testArrayValues() {
        String simulatedInput = "Sunday\nMonday\nTuesday\nWednesday\nThursday\nFriday\nSaturday\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E72Arrays.main(new String[]{});
        String expectedOutput = "Please enter day 1 of the week:" + System.lineSeparator() +
                                "Please enter day 2 of the week:" + System.lineSeparator() +
                                "Please enter day 3 of the week:" + System.lineSeparator() +
                                "Please enter day 4 of the week:" + System.lineSeparator() +
                                "Please enter day 5 of the week:" + System.lineSeparator() +
                                "Please enter day 6 of the week:" + System.lineSeparator() +
                                "Please enter day 7 of the week:" + System.lineSeparator() +
                                "Sunday" + System.lineSeparator() +
                                "Monday" + System.lineSeparator() +
                                "Tuesday" + System.lineSeparator() +
                                "Wednesday" + System.lineSeparator() +
                                "Thursday" + System.lineSeparator() +
                                "Friday" + System.lineSeparator() +
                                "Saturday" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the array.\n" +
                "Please ensure that your program correctly prompts the user, stores the input, and prints all values.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
