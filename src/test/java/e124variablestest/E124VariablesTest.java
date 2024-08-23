package e124variablestest;

import org.example.e124.E124Variables;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

public class E124VariablesTest {

    @Test
    public void testStaticVariableAccess() {
        try {
            // Use reflection to access the static variable
            Field staticField = E124Variables.class.getDeclaredField("ss");
            staticField.setAccessible(true);
            String value = (String) staticField.get(null);

            // Expected value
            String expectedValue = "Welcome To Syntax Technologies";

            // Assert that the static variable has the expected value
            assertEquals("Static variable value is not as expected.", expectedValue, value);
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals("Static variable not implemented correctly.", true, false);
        }
    }
}
