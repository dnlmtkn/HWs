package e45Test;

import org.example.e45.E45SwitchClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E45SwitchClassTest {

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
    void testEspresso() {
        String simulatedInput = "1\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E45SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)" + System.lineSeparator() +
                "The price of your coffee is $3.0" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Espresso.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testLatte() {
        String simulatedInput = "2\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E45SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)" + System.lineSeparator() +
                "The price of your coffee is $4.0" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Latte.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testCappuccino() {
        String simulatedInput = "3\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E45SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)" + System.lineSeparator() +
                "The price of your coffee is $4.5" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Cappuccino.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testMocha() {
        String simulatedInput = "4\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E45SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)" + System.lineSeparator() +
                "The price of your coffee is $5.0" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Mocha.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testInvalidCoffeeType() {
        String simulatedInput = "5\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E45SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)" + System.lineSeparator() +
                "Invalid coffee type entered" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for invalid coffee type.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}