package e122variablestest;

import org.example.e122.E122Variables;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class E122VariablesTest {

    @Test
    public void testInstanceVariablesAndMethods() {
        try {
            // Use reflection to access the instance variables and methods
            E122Variables obj1 = new E122Variables();
            E122Variables obj2 = new E122Variables();

            // Access instance variables using reflection
            Field countryField = E122Variables.class.getDeclaredField("countryName");
            Field capitalField = E122Variables.class.getDeclaredField("capital");
            Field populationField = E122Variables.class.getDeclaredField("populationSize");

            // Assert that the fields are not null (i.e., they exist)
            assertNotNull(countryField);
            assertNotNull(capitalField);
            assertNotNull(populationField);

            // Set the fields to be accessible
            countryField.setAccessible(true);
            capitalField.setAccessible(true);
            populationField.setAccessible(true);

            // Access the display method using reflection
            Method displayMethod = E122Variables.class.getDeclaredMethod("display");

            // Assert that the method is not null (i.e., it exists)
            assertNotNull(displayMethod);

            // Set the method to be accessible
            displayMethod.setAccessible(true);

            // Assign values to the first instance using reflection
            countryField.set(obj1, "USA");
            capitalField.set(obj1, "Washington DC");
            populationField.set(obj1, 330000000);

            // Assign values to the second instance using reflection
            countryField.set(obj2, "Kazakhstan");
            capitalField.set(obj2, "Astana");
            populationField.set(obj2, 18500000);

            // Redirect the system output stream to capture the display method output
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(outputStream));

            // Invoke the display method using reflection
            displayMethod.invoke(obj1);
            displayMethod.invoke(obj2);

            // Reset the system output stream back to original
            System.setOut(originalOut);

            // Split captured output
            String[] output = outputStream.toString().split("\\r?\\n");

            // Adding a detailed failure message
            String failureMessage1 = "The output does not match the expected format for the first instance.";
            String failureMessage2 = "The output does not match the expected format for the second instance.";

            // Assert the outputs
            assertEquals(failureMessage1, "The capital of USA is Washington DC and population is 330000000", output[0]);
            assertEquals(failureMessage2, "The capital of Kazakhstan is Astana and population is 18500000", output[1]);

        } catch (Exception e) {
            e.printStackTrace();
            // This will fail the test if an exception is caught
            assertEquals("Instance variables or methods not implemented correctly.", true, false);
        }
    }
}
