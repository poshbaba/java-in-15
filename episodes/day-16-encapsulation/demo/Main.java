public class Main {
    public static void main(String[] args) {
        Application app = new Application("booking-api");
        System.out.println("Scaled: " + app.scaleTo(3));
        System.out.println("Scaled: " + app.scaleTo(-1));
        app.printSummary();
    }
}
class Application {
    private final String name;
    private int replicas = 1;
    Application(String name) { this.name = name; }
    boolean scaleTo(int replicas) {
        if (replicas < 1) { return false; }
        this.replicas = replicas;
        return true;
    }
    String getName() { return name; }
    void printSummary() {
        System.out.println(name + ": " + replicas + " replicas");
    }
}
