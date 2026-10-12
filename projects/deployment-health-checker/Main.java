public class Main {
    public static void main(String[] args) {
        String application = "booking-api";
        String[] environments = {"DEV", "QA", "STG", "PROD"};
        double health = calculateHealthPercentage(20, 19);
        String status = classifyHealth(health);

        System.out.println("Application: " + application);
        System.out.println("Health: " + health + "%");
        System.out.println("Decision: " + status);
        for (int i = 0; i < environments.length; i++) {
            System.out.println("Checking environment: " + environments[i]);
        }
        selectEnvironment("PROD");
        if (status.equals("Approved")) {
            deployApplication(application);
        } else {
            System.out.println("Deployment blocked: " + status);
        }
    }

    public static double calculateHealthPercentage(int totalPods, int healthyPods) {
        // This beginner version requires valid counts and a positive total.
        return healthyPods * 100.0 / totalPods;
    }

    public static String classifyHealth(double health) {
        if (health >= 95) {
            return "Approved";
        } else if (health >= 80) {
            return "Review required";
        } else {
            return "Rejected";
        }
    }

    public static void selectEnvironment(String environment) {
        switch (environment) {
            case "DEV": System.out.println("Development deployment"); break;
            case "QA": System.out.println("Testing deployment"); break;
            case "STG": System.out.println("Staging deployment"); break;
            case "PROD": System.out.println("Production deployment"); break;
            default: System.out.println("Unknown environment");
        }
    }

    public static void deployApplication(String application) {
        int attempts = 0;
        int maxAttempts = 3;
        boolean successful = false;
        while (!successful && attempts < maxAttempts) {
            attempts++;
            System.out.println("Deploying " + application + ": attempt " + attempts);
            if (attempts == 2) {
                successful = true;
            }
        }
        System.out.println("Deployment successful: " + successful);
    }
}
