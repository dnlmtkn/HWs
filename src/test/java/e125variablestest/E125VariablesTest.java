package e125variablestest;

import org.example.e125.E125Variables;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

public class E125VariablesTest {

    @Test
    public void testStaticVariableAccess() {
        try {
            // Use reflection to access the static variable
            Field staticField = E125Variables.class.getDeclaredField("number");
            staticField.setAccessible(true);

            // Create an instance of the class
            E125Variables instance = new E125Variables();

            // Assign value to the static variable using reflection
            staticField.set(null, 200);

            // Assign value to the static variable using the instance
            staticField.set(instance, 200);

            // Retrieve the value using both methods
            int valueClass = (int) staticField.get(null);
            int valueInstance = (int) staticField.get(instance);

            // Expected value
            int expectedValue = 200;

            // Assert that the static variable has the expected value
            assertEquals("Static variable value using class name is not as expected.", expectedValue, valueClass);
            assertEquals("Static variable value using instance is not as expected.", expectedValue, valueInstance);
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals("Static variable not implemented correctly.", true, false);
        }
    }
}
