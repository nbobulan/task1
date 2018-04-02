import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by nbobulan on 4/2/18.
 */
public class EngineerTest {

    @Test
    public void testGetTeamName() throws Exception {
        String expectedValue = "Admin";
        Engineer engineer = new Engineer(expectedValue, "Travel");
        assertEquals(engineer.getTeamName(), expectedValue);
    }

}