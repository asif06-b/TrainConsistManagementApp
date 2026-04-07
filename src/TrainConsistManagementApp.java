import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        Set<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper"); // duplicate

        System.out.println("Final Formation: " + formation);
    }
}