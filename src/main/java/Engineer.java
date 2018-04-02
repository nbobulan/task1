/**
 * Created by nbobulan on 4/2/18.
 */
public class Engineer {

    private final String teamName;
    private final String projectName;
    private String salary;

    public Engineer(String teamName, String projectName) {

        this.teamName = teamName;
        this.projectName = projectName;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}

