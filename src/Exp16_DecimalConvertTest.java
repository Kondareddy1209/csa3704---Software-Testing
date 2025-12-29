package junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exp16_DecimalConvertTest {

    @Test
    public void testConvert() {
        int n = 10;
        assertEquals("1010", Integer.toBinaryString(n));
        assertEquals("12", Integer.toOctalString(n));
    }
}
