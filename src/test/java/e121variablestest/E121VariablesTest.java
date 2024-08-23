package e121variablestest;

import org.example.e121.E121Variables;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

public class E121VariablesTest {

    @Test
    public void testInstanceVariables() {
        try {
            // Use reflection to access the instance variables
            E121Variables obj1 = new E121Variables();
            E121Variables obj2 = new E121Variables();

            Field intField = E121Variables.class.getDeclaredField("intValue");
            Field doubleField = E121Variables.class.getDeclaredField("doubleValue");
            Field charField = E121Variables.class.getDeclaredField("charValue");

            intField.setAccessible(true);
            doubleField.setAccessible(true);
            charField.setAccessible(true);

            // Assign values to the first instance
            intField.set(obj1, 10);
            doubleField.set(obj1, 10.23);
            charField.set(obj1, 'a');

            // Assign values to the second instance
            intField.set(obj2, 100);
            doubleField.set(obj2, 100.23);
            charField.set(obj2, 's');

            // Print values to verify
            String output1 = intField.get(obj1) + "\n" + doubleField.get(obj1) + "\n" + charField.get(obj1);
            String output2 = intField.get(obj2) + "\n" + doubleField.get(obj2) + "\n" + charField.get(obj2);

            // Adding a detailed failure message
            String failureMessage1 = "The output does not match the expected format for the first instance.";
            String failureMessage2 = "The output does not match the expected format for the second instance.";

            assertEquals(failureMessage1, "10\n10.23\na", output1);
            assertEquals(failureMessage2, "100\n100.23\ns", output2);
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals("Instance variables not implemented correctly.", true, false);
        }
    }
}
