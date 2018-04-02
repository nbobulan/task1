/**
 * Created by nbobulan on 4/2/18.
 */
public class Engineer {

    protected String teamName;
    protected String projectName;
    protected int salary;

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

