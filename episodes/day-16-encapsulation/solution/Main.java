public class Main {
    public static void main(String[] args) {
        Application app = new Application("booking-api");
        System.out.println("Scale to 5: " + app.scaleTo(5));
        System.out.println("Scale to 0: " + app.scaleTo(0));
        System.out.println("Final replicas: " + app.getReplicas());
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
    int getReplicas() { return replicas; }
}
