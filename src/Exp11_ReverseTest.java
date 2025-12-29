package junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exp11_ReverseTest {

    public static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    @Test
    public void testMani() {
        assertEquals("inam", reverse("mani"));
    }

    @Test
    public void testAmar() {
        assertEquals("ramA", reverse("Amar"));
    }
}
