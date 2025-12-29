package junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exp17_DaysConvertTest {

    public static int[] convert(int days) {
        int y = days / 365;
        days %= 365;
        int w = days / 7;
        int d = days % 7;
        return new int[]{y, w, d};
    }

    @Test
    public void testDays() {
        int[] r = convert(400);
        assertEquals(1, r[0]);
    }
}
