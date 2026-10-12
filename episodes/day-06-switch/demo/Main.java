public class Main {
    public static void main(String[] args) {

        String environment = "QA";

        switch (environment) {
            case "DEV":
                System.out.println("Development deployment");
                break;

            case "QA":
                System.out.println("Testing deployment");
                break;

            case "PROD":
                System.out.println("Production deployment");
                break;

            default:
                System.out.println("Unknown environment");
        }
    }
}
