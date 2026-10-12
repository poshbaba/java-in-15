import java.io.PrintStream;
public final class DeploymentService {
    public static boolean deploy(Deployable application, Environment environment, int maxAttempts, PrintStream output) {
        if (maxAttempts < 1 || maxAttempts > 5) { throw new IllegalArgumentException("Attempts must be between one and five"); }
        int attempts = 0;
        boolean successful = false;
        while (!successful && attempts < maxAttempts) {
            attempts++;
            output.println("Deployment attempt: " + attempts);
            successful = application.deploy(environment, attempts);
        }
        return successful;
    }
}
