package Lab01TurmaB;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD by writing your own tests

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals(SharkPontoon.shark(12, 50, 4, 8, true), "Alive!");
        assertEquals(SharkPontoon.shark(7, 55, 4, 16, true), "Alive!");
        assertEquals(SharkPontoon.shark(24, 0, 4, 8, true), "Shark Bait!");
    }
}
