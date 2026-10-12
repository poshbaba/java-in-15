import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Application> apps = new ArrayList<>();
        apps.add(new Application("booking-api"));
        apps.add(new Application("payment-api"));
        apps.add(new Application("catalog-api"));
        apps.remove(1);
        for (Application app : apps) {
            System.out.println("Application: " + app.getName());
        }
        System.out.println("Count: " + apps.size());
    }
}
class Application {
    private final String name;
    Application(String name) { this.name = name; }
    String getName() { return name; }
}
