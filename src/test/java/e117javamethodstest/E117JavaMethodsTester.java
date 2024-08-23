package e117javamethodstest;

import org.example.e117.E117JavaMethods;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class E117JavaMethodsTester {

    @Test
    void testSumEvenToXMethodExists() {
        try {
            Method method = E117JavaMethods.class.getMethod("sumEvenToX", int.class);
            assertNotNull(method, "Method sumEvenToX should exist and accept an integer parameter.");
        } catch (NoSuchMethodException e) {
            fail("Method sumEvenToX does not exist or does not accept an integer parameter.");
        }
    }

    @Test
    void testSumEvenToXMethod() {
        try {
            Method method = E117JavaMethods.class.getMethod("sumEvenToX", int.class);
            assertEquals(6, method.invoke(null, 5), "The output does not match the expected result for input 5.");
            assertEquals(20, method.invoke(null, 8), "The output does not match the expected result for input 8.");
        } catch (Exception e) {
            fail("Method sumEvenToX should be implemented correctly.");
        }
    }
}
