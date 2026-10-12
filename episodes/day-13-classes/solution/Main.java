public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        app.name = "booking-api";
        app.environment = "QA";
        app.replicas = 3;
        app.printSummary();
    }
}
class Application {
    String name;
    String environment;
    int replicas;
    void printSummary() {
        System.out.println(name + " -> " + environment + ": " + replicas + " replicas");
    }
}
