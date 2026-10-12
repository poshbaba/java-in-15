public class Main {
    public static void main(String[] args) {
        String environment = "STG";
        switch (environment) {
            case "DEV": System.out.println("Development deployment"); break;
            case "QA": System.out.println("Testing deployment"); break;
            case "STG": System.out.println("Staging deployment"); break;
            case "PROD": System.out.println("Production deployment"); break;
            default: System.out.println("Unknown environment");
        }
    }
}
