public class Main {

    public static void main(String[] args) {

        String application = "booking-api";
        double health = 96.5;

        boolean approved = checkHealth(health);

        if (approved) {
            deployApplication(application);
        } else {
            System.out.println("Deployment blocked");
        }
    }

    public static boolean checkHealth(double health) {
        return health >= 95;
    }

    public static void deployApplication(String application) {
        System.out.println("Deploying " + application);
    }
}
