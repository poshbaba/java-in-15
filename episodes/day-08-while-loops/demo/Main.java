public class Main {
    public static void main(String[] args) {

        int attempts = 0;
        int maxAttempts = 3;
        boolean deploymentSuccessful = false;

        while (!deploymentSuccessful && attempts < maxAttempts) {

            attempts++;

            System.out.println("Deployment attempt: " + attempts);

            if (attempts == 3) {
                deploymentSuccessful = true;
            }
        }

        System.out.println(
                "Deployment successful: " + deploymentSuccessful
        );
    }
}
