public class Main {
    public static void main(String[] args) {
        deploy("booking-api", "DEV");
        deploy("payment-api", "QA", 3);
    }
    public static void deploy(String application, String environment) {
        deploy(application, environment, 1);
    }
    public static void deploy(String application, String environment, int replicas) {
        System.out.println(application + " -> " + environment + ": " + replicas + " replicas");
    }
}
