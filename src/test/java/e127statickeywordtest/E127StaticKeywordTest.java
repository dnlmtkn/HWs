package e127statickeywordtest;

import org.example.e127.E127StaticKeyword;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E127StaticKeywordTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testMethodsOutput() {
        // Create an instance of the class
        E127StaticKeyword instance = new E127StaticKeyword();

        // Call the non-static method using the instance
        try {
            E127StaticKeyword.class.getMethod("nonStaticMethod").invoke(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Call the static method using the class name
        try {
            E127StaticKeyword.class.getMethod("staticMethod").invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Expected output (handle the correct line separator)
        String expectedOutput = "Programming is amazing." + System.lineSeparator() +
                "Java is awesome." + System.lineSeparator();

        // Assert the output
        assertEquals("Output is not as expected.", expectedOutput, outContent.toString());
    }
}
