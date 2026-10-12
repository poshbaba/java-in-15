public class Main {
    public static void main(String[] args) {
        Application app = new Application("booking-api", "QA", 3);
        app.printSummary();
    }
}
class Application {
    String name;
    String environment;
    int replicas;
    Application(String name, String environment, int replicas) {
        this.name = name;
        this.environment = environment;
        this.replicas = replicas;
    }
    void printSummary() {
        System.out.println(name + " -> " + environment + ": " + replicas + " replicas");
    }
}
