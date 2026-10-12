public class Main {
    public static void main(String[] args) {
        deploy("booking-api");
        deploy("payment-api", "QA");
    }
    public static void deploy(String application) {
        deploy(application, "DEV");
    }
    public static void deploy(String application, String environment) {
        System.out.println("Deploying " + application + " to " + environment);
    }
}
