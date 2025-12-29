package junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exp15_PalindromeTest {

    public static boolean isPal(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    @Test
    public void testPal() {
        assertEquals(true, isPal("madam"));
    }
}
