package e123variablestest;

import org.example.e123.E123Variables;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

public class E123VariablesTest {

    @Test
    public void testInstanceVariables() {
        try {
            // Create an instance of E123Variables
            E123Variables obj = new E123Variables();

            // Use reflection to access the instance variables
            Field intField = E123Variables.class.getDeclaredField("myInt");
            Field stringField = E123Variables.class.getDeclaredField("myString");
            Field doubleField = E123Variables.class.getDeclaredField("myDouble");
            Field booleanField = E123Variables.class.getDeclaredField("myBoolean");
            Field floatField = E123Variables.class.getDeclaredField("myFloat");

            // Make fields accessible if they're private
            intField.setAccessible(true);
            stringField.setAccessible(true);
            doubleField.setAccessible(true);
            booleanField.setAccessible(true);
            floatField.setAccessible(true);

            // Assert default values
            assertEquals("Expected default int value is 0.", 0, intField.getInt(obj));
            assertEquals("Expected default String value is null.", null, stringField.get(obj));
            assertEquals("Expected default double value is 0.0.", 0.0, doubleField.getDouble(obj), 0.0);
            assertEquals("Expected default boolean value is false.", false, booleanField.getBoolean(obj));
            assertEquals("Expected default float value is 0.0.", 0.0f, floatField.getFloat(obj), 0.0f);

        } catch (Exception e) {
            e.printStackTrace();
            // Fail the test if any exception occurs
            assertEquals("Instance variables not implemented or accessed correctly.", true, false);
        }
    }
}
