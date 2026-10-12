public class Main {
    public static void main(String[] args) {
        Application app = new WebApplication("booking-api");
        app.deploy();
    }
}
class Application {
    private final String name;
    Application(String name) { this.name = name; }
    String getName() { return name; }
    void deploy() { System.out.println("Deploying " + name); }
}
class WebApplication extends Application {
    WebApplication(String name) { super(name); }
    @Override
    void deploy() { System.out.println("Deploying web application: " + getName()); }
}
