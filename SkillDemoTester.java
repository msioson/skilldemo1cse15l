import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void testRemainder() {
        assertEquals(1, SkillDemo.remainder(3, 2));
    }
}

// javac -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" SkillDemoTester.java
// java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore SkillDemoTester