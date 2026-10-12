public class Main {
    public static void main(String[] args) {
        new Application("booking-api").printSummary();
        new Application("payment-api", "QA", 3).printSummary();
    }
}
class Application {
    String name;
    String environment;
    int replicas;
    Application(String name) {
        this(name, "DEV", 1);
    }
    Application(String name, String environment, int replicas) {
        this.name = name;
        this.environment = environment;
        this.replicas = replicas;
    }
    void printSummary() {
        System.out.println(name + " -> " + environment + ": " + replicas + " replicas");
    }
}
