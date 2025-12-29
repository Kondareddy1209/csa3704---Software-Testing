package junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exp14_SimpleInterestTest {

    public static double si(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    @Test
    public void testSI() {
        assertEquals(1200.0, si(10000, 12, 1), 0.01);
    }
}
