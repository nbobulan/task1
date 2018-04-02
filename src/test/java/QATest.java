import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by nbobulan on 4/2/18.
 */
public class QATest {
    @Test
    public void testGetCreateTest() throws Exception {
        String expectedValue = "Created a test";
        QA qa = new QA("Admin", "Travel");
        assertEquals(qa.createTest(), expectedValue);
    }

    @Test
    public void testGetPostBug() throws Exception {
        String expectedValue = "Posted a bug";
        QA qa = new QA("Admin", "Travel");
        assertEquals(qa.postBug(), expectedValue);
    }

}