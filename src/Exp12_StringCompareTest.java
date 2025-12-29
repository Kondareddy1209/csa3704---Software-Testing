package junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exp12_StringCompareTest {

    @Test
    public void testEqual() {
        String a = "Saveetha";
        String b = "Saveetha";
        assertEquals(a, b);
    }
}
