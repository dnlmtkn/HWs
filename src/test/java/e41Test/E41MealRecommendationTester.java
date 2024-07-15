package e41Test;

import org.example.e41.E41SwitchClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E41MealRecommendationTester {

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
    void testMorning() {
        String simulatedInput = "morning\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E41SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the time of day (morning, afternoon, evening, night)" + System.lineSeparator() +
                                "morning" + System.lineSeparator() +
                                "Recommended meal: Breakfast" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for morning.\n" +
                "Please ensure that your program captures the input correctly and recommends the right meal.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testAfternoon() {
        String simulatedInput = "afternoon\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E41SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the time of day (morning, afternoon, evening, night)" + System.lineSeparator() +
                                "afternoon" + System.lineSeparator() +
                                "Recommended meal: Lunch" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for afternoon.\n" +
                "Please ensure that your program captures the input correctly and recommends the right meal.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testEvening() {
        String simulatedInput = "evening\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E41SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the time of day (morning, afternoon, evening, night)" + System.lineSeparator() +
                                "evening" + System.lineSeparator() +
                                "Recommended meal: Dinner" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for evening.\n" +
                "Please ensure that your program captures the input correctly and recommends the right meal.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testNight() {
        String simulatedInput = "night\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E41SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the time of day (morning, afternoon, evening, night)" + System.lineSeparator() +
                                "night" + System.lineSeparator() +
                                "Recommended meal: Snack" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for night.\n" +
                "Please ensure that your program captures the input correctly and recommends the right meal.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testInvalidTimeOfDay() {
        String simulatedInput = "midnight\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E41SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the time of day (morning, afternoon, evening, night)" + System.lineSeparator() +
                                "midnight" + System.lineSeparator() +
                                "Invalid time of day entered" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for an invalid time of day.\n" +
                "Please ensure that your program captures the input correctly and handles invalid times of day.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
