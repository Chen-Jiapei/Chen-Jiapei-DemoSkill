import static org.junit.Assert.*;
import org.junit.*; //importing junit test

public class SkillDemoTest {
    @Test
    public void SkillDemoTest1() {
        assertEquals(true, SkillDemo.isGreater(2, 1));
    }
}