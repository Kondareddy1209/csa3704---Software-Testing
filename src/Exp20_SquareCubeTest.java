package junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exp20_SquareCubeTest {

    @Test
    public void testSC() {
        int n = 5;
        assertEquals(25, n * n);
        assertEquals(125, n * n * n);
    }
}
