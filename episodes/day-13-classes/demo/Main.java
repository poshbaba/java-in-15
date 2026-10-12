public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        app.name = "booking-api";
        app.replicas = 3;
        app.printSummary();
    }
}
class Application {
    String name;
    int replicas;
    void printSummary() {
        System.out.println(name + ": " + replicas + " replicas");
    }
}
