package junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exp18_FactorialTest {

    public static int fact(int n) {
        return (n == 0) ? 1 : n * fact(n - 1);
    }

    @Test
    public void testFact() {
        assertEquals(120, fact(5));
    }
}
