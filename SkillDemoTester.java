import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void testRemainder() {
        assertEquals(2, SkillDemo.remainder(3, 2));
    }
}