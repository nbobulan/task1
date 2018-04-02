import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by nbobulan on 4/2/18.
 */
public class DevTest  {

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

    @Test
    public void testGetProjectName() throws Exception {
        String expectedValue = "Travel";
        Engineer engineer = new Engineer("", expectedValue);
        assertEquals(engineer.getProjectName(), expectedValue);
    }

    @Test
    public void testGetTeamName() throws Exception {
        String expectedValue = "Admin";
        Engineer engineer = new Engineer(expectedValue, "");
        assertEquals(engineer.getTeamName(), expectedValue);
    }

    @Test
    public void testGetSalary() throws Exception {
        Engineer engineer = new Engineer("", "");
        assertEquals(engineer.getSalary(), 0);
    }

    @Test
    public void testSetSalary() throws Exception {
        Engineer engineer = new Engineer("", "");
        engineer.setSalary(1000);
        assertEquals(engineer.getSalary(), 1000);
    }


}