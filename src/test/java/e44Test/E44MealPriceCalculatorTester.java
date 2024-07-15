package e44Test;

import org.example.e44.E44SwitchClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E44MealPriceCalculatorTester {

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
    void testBreakfast() {
        String simulatedInput = "1\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E44SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)" + System.lineSeparator() +
                                "1" + System.lineSeparator() +
                                "The price of your meal is $5.0" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for breakfast.\n" +
                "Please ensure that your program captures the input correctly and calculates the price.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testLunch() {
        String simulatedInput = "2\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E44SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)" + System.lineSeparator() +
                                "2" + System.lineSeparator() +
                                "The price of your meal is $10.0" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for lunch.\n" +
                "Please ensure that your program captures the input correctly and calculates the price.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testDinner() {
        String simulatedInput = "3\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E44SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)" + System.lineSeparator() +
                                "3" + System.lineSeparator() +
                                "The price of your meal is $15.0" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for dinner.\n" +
                "Please ensure that your program captures the input correctly and calculates the price.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testInvalidMealType() {
        String simulatedInput = "4\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E44SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)" + System.lineSeparator() +
                                "4" + System.lineSeparator() +
                                "Invalid meal type entered" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for an invalid meal type.\n" +
                "Please ensure that your program captures the input correctly and handles invalid meal types.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
