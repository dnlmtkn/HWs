package e119javamethodstest;

import org.example.e119.E119JavaMethods;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class E119JavaMethodsTest {

    @Test
    public void testCensorLetterMethod() {
        try {
            // Use reflection to find the method
            Method method = E119JavaMethods.class.getDeclaredMethod("censorLetter", String.class, char.class);
            String result1 = (String) method.invoke(null, "computer science", 'e');
            String result2 = (String) method.invoke(null, "trick or treat", 't');

            // Adding a detailed failure message
            String failureMessage1 = "The output does not match the expected result for input 'computer science' with 'e'.";
            String failureMessage2 = "The output does not match the expected result for input 'trick or treat' with 't'.";

            assertEquals(failureMessage1, "comput*r sci*nc*", result1);
            assertEquals(failureMessage2, "*rick or *rea*", result2);
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals("Method censorLetter not implemented correctly.", true, false);
        }
    }
}
