import static org.junit.Assert.*;
import org.junit.*; //importing junit test

public class SkillDemoTest {
    public void SkillDemoTest1() {
        SkillDemo Demo = new SkillDemo();
        assertEquals(true, Demo.isGreater(2, 1));
    }
}