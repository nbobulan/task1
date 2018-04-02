/**
 * Created by nbobulan on 4/2/18.
 */
public class Dev extends Engineer {

    public Dev(String teamName, String projectName) {
        super(teamName, projectName);
    }

    public String writeClass() {
        return "Write a class";
    }

    public String fixBug() {
        return "Fix a bug";
    }
}
