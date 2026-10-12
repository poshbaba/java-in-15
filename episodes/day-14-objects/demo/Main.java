public class Main {
    public static void main(String[] args) {
        Application booking = new Application();
        booking.name = "booking-api";
        booking.replicas = 3;
        Application payment = new Application();
        payment.name = "payment-api";
        payment.replicas = 2;
        Application alias = booking;
        alias.replicas = 4;
        booking.printSummary();
        payment.printSummary();
        System.out.println("Same object: " + (alias == booking));
    }
}
class Application {
    String name;
    int replicas;
    void printSummary() {
        System.out.println(name + ": " + replicas + " replicas");
    }
}
