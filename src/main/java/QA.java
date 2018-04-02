/**
 * Created by nbobulan on 4/2/18.
 */
public class QA extends Engineer{

    public QA(String teamName, String projectName) {
        super(teamName, projectName);
    }


    public String createTest() {
        return "Created a test";
    }

    public String postBug() {
        return "Posted a bug";
    }
}
