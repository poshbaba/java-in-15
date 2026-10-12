public class Main {
    public static void main(String[] args) {
        Application inventory = new Application();
        inventory.name = "inventory-api";
        inventory.replicas = 2;
        Application notifications = new Application();
        notifications.name = "notification-api";
        notifications.replicas = 4;
        inventory.replicas = 5;
        inventory.printSummary();
        notifications.printSummary();
    }
}
class Application {
    String name;
    int replicas;
    void printSummary() {
        System.out.println(name + ": " + replicas + " replicas");
    }
}
