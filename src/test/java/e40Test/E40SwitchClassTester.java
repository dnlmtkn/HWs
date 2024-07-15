package e40Test;

import org.example.e40.E40SwitchClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E40SwitchClassTester {

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
    void testAsghar() {
        String simulatedInput = "Asghar\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E40SwitchClass.main(new String[]{});
        String expectedOutput = "Enter name of the instructor" + System.lineSeparator() +
                                "Asghar" + System.lineSeparator() +
                                "Will take care of Java Assignment" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Asghar.\n" +
                "Please ensure that your program captures the input correctly and determines the responsibility.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testMoazzam() {
        String simulatedInput = "Moazzam\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E40SwitchClass.main(new String[]{});
        String expectedOutput = "Enter name of the instructor" + System.lineSeparator() +
                                "Moazzam" + System.lineSeparator() +
                                "Will take care of SDLC Assignment" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Moazzam.\n" +
                "Please ensure that your program captures the input correctly and determines the responsibility.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testWeqas() {
        String simulatedInput = "Weqas\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E40SwitchClass.main(new String[]{});
        String expectedOutput = "Enter name of the instructor" + System.lineSeparator() +
                                "Weqas" + System.lineSeparator() +
                                "Will take care of Selenium Assignment" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Weqas.\n" +
                "Please ensure that your program captures the input correctly and determines the responsibility.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testAsel() {
        String simulatedInput = "Asel\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E40SwitchClass.main(new String[]{});
        String expectedOutput = "Enter name of the instructor" + System.lineSeparator() +
                                "Asel" + System.lineSeparator() +
                                "Will take care of every Assignment" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Asel.\n" +
                "Please ensure that your program captures the input correctly and determines the responsibility.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testInvalidInstructor() {
        String simulatedInput = "John\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E40SwitchClass.main(new String[]{});
        String expectedOutput = "Enter name of the instructor" + System.lineSeparator() +
                                "John" + System.lineSeparator() +
                                "Invalid instructor selected" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for an invalid instructor.\n" +
                "Please ensure that your program captures the input correctly and handles invalid instructor names.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
