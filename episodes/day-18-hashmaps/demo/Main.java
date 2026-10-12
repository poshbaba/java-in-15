import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> environments = new HashMap<>();
        environments.put("booking-api", "DEV");
        environments.put("payment-api", "QA");
        environments.put("booking-api", "PROD");
        System.out.println("booking-api: " + environments.get("booking-api"));
        System.out.println("Contains catalog-api: " + environments.containsKey("catalog-api"));
        System.out.println("Count: " + environments.size());
    }
}
