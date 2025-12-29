package junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exp13_VotingTest {

    public static boolean canVote(int age) {
        return age >= 18;
    }

    @Test
    public void testVote() {
        assertEquals(true, canVote(20));
    }
}
