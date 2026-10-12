import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Path config = Path.of(args.length > 0 ? args[0] : "config/applications.json");
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<Application> applications = Configuration.load(config);
            System.out.println("DEPLOYMENT MANAGER");
            for (int i = 0; i < applications.size(); i++) {
                System.out.println((i + 1) + ". " + applications.get(i).getName());
            }
            System.out.println("Select application:");
            Application application = applications.get(readChoice(input, applications.size()) - 1);
            Environment[] environments = Environment.values();
            for (int i = 0; i < environments.length; i++) {
                System.out.println((i + 1) + ". " + environments[i]);
            }
            System.out.println("Select environment:");
            Environment environment = environments[readChoice(input, environments.length) - 1];
            double health = application.healthPercentage();
            String decision = HealthPolicy.classify(health);
            System.out.println("Application: " + application.getName());
            System.out.println("Environment: " + environment);
            System.out.println("Health: " + health + "%");
            System.out.println("Decision: " + decision);
            if (!decision.equals("Approved")) {
                System.out.println("Deployment blocked: " + decision);
                return;
            }
            boolean successful = DeploymentService.deploy(application, environment, 3, System.out);
            System.out.println("Deployment successful: " + successful);
            if (!successful) { System.exit(1); }
        } catch (IOException | IllegalArgumentException exception) {
            System.err.println("Cannot run deployment: " + exception.getMessage());
            System.exit(1);
        }
    }
    private static int readChoice(Scanner input, int max) {
        if (!input.hasNextLine()) { throw new IllegalArgumentException("A menu selection is required"); }
        int choice = Integer.parseInt(input.nextLine().trim());
        if (choice < 1 || choice > max) { throw new IllegalArgumentException("Selection must be between one and " + max); }
        return choice;
    }
}
