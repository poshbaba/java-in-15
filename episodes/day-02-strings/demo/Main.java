public class Main {
    public static void main(String[] args) {

        String application = "booking-api";
        String environment = "PROD";

        String message = "Deploying " + application
                + " to " + environment;

        System.out.println(message);

        System.out.println(application.length());

        System.out.println(environment.toLowerCase());

        System.out.println(environment.equals("PROD"));
    }
}
