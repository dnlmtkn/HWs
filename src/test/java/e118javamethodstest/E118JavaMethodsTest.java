package e118javamethodstest;

import org.example.e118.E118JavaMethods;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class E118JavaMethodsTest {

    @Test
    public void testSpaceOutMethod() {
        try {
            // Use reflection to find the method
            Method method = E118JavaMethods.class.getDeclaredMethod("spaceOut", String.class);
            String result1 = (String) method.invoke(null, "hello");
            String result2 = (String) method.invoke(null, "technology");

            // Adding a detailed failure message
            String failureMessage1 = "The output does not match the expected result for input 'hello'.";
            String failureMessage2 = "The output does not match the expected result for input 'technology'.";

            assertEquals(failureMessage1, "h e l l o ", result1);
            assertEquals(failureMessage2, "t e c h n o l o g y ", result2);
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals("Method spaceOut not implemented correctly.", true, false);
        }
    }
}
