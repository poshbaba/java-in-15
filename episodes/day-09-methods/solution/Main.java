public class Main {
    public static void main(String[] args) {
        startDeployment();
        runSecurityScan();
        completeDeployment();
    }
    public static void startDeployment() {
        System.out.println("Starting deployment...");
    }
    public static void runSecurityScan() {
        System.out.println("Running security scan...");
    }
    public static void completeDeployment() {
        System.out.println("Deployment complete.");
    }
}
