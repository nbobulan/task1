import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by nbobulan on 4/2/18.
 */
public class DevTest {
    @Test
    public void testWriteClass() throws Exception {
        String expectedValue = "Write a class";
        Dev dev = new Dev("Admin", "Travel");
        assertEquals(dev.writeClass(), expectedValue);
    }

    @Test
    public void testFixBug() throws Exception {
        String expectedValue = "Fix a bug";
        Dev dev = new Dev("Admin", "Travel");
        assertEquals(dev.fixBug(), expectedValue);

    }

}