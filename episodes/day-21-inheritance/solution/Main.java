public class Main {
    public static void main(String[] args) {
        Application[] apps = {new WebApplication("booking-api"), new BatchApplication("report-job")};
        for (Application app : apps) { app.deploy(); }
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
    @Override void deploy() { System.out.println("Deploying web application: " + getName()); }
}
class BatchApplication extends Application {
    BatchApplication(String name) { super(name); }
    @Override void deploy() { System.out.println("Deploying batch application: " + getName()); }
}
