package e126variablestest;

import org.example.e126.E126Variables;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

public class E126VariablesTest {

    @Test
    public void testInstanceCount() {
        try {
            // Use reflection to access the static variable
            Field staticField = E126Variables.class.getDeclaredField("instanceCount");
            staticField.setAccessible(true);

            // Create instances of the class
            new E126Variables();
            new E126Variables();
            new E126Variables();

            // Retrieve the value of the instance count
            int instanceCount = (int) staticField.get(null);

            // Expected value
            int expectedValue = 3;

            // Assert that the instance count is as expected
            assertEquals("Instance count is not as expected.", expectedValue, instanceCount);
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals("Instance count not implemented correctly.", true, false);
        }
    }
}
