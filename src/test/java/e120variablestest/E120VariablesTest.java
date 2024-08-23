package e120variablestest;

import org.example.e120.E120Variables;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

public class E120VariablesTest {

    @Test
    public void testInstanceVariables() {
        try {
            // Use reflection to access the instance variables
            E120Variables obj = new E120Variables();

            Field yearField = E120Variables.class.getDeclaredField("year");
            Field schoolNameField = E120Variables.class.getDeclaredField("schoolName");
            Field batchNumberField = E120Variables.class.getDeclaredField("batchNumber");

            yearField.setAccessible(true);
            schoolNameField.setAccessible(true);
            batchNumberField.setAccessible(true);

            yearField.set(obj, 2020);
            schoolNameField.set(obj, "Syntax");
            batchNumberField.set(obj, 6);

            // Print values to verify
            String output = "I am a student of batch " + batchNumberField.get(obj) +
                    " studying at " + schoolNameField.get(obj) +
                    " in the year of " + yearField.get(obj);

            // Adding a detailed failure message
            String failureMessage = "The output does not match the expected format.";

            assertEquals(failureMessage, "I am a student of batch 6 studying at Syntax in the year of 2020", output);
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals("Instance variables not implemented correctly.", true, false);
        }
    }
}
