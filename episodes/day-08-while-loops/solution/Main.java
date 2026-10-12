public class Main {
    public static void main(String[] args) {
        int attempts = 0;
        int maxAttempts = 5;
        boolean healthy = false;
        while (!healthy && attempts < maxAttempts) {
            attempts++;
            System.out.println("Health check attempt: " + attempts);
            if (attempts == 4) {
                healthy = true;
            }
        }
        System.out.println("Healthy: " + healthy);
    }
}
