import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by nbobulan on 4/2/18.
 */
public class EngineerTest {
    @Test
    public void testGetProjectName() throws Exception {
        String expectedValue = "Travel";
        Engineer engineer = new Engineer("", expectedValue);
        assertEquals(engineer.getProjectName(), expectedValue);
    }

    @Test
    public void testGetSalary() throws Exception {
        Engineer engineer = new Engineer("", "");
        assertEquals(engineer.getSalary(), null);
    }

    @Test
    public void testSetSalary() throws Exception {
        Engineer engineer = new Engineer("", "");
        engineer.setSalary(1000);
        assertEquals(engineer.getSalary(), 1000);
    }

    @Test
    public void testGetTeamName() throws Exception {
        String expectedValue = "Admin";
        Engineer engineer = new Engineer(expectedValue, "");
        assertEquals(engineer.getTeamName(), expectedValue);
    }

}