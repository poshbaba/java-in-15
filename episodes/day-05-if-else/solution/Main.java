public class Main {
    public static void main(String[] args) {
        double health = 79.9;
        if (health >= 95) {
            System.out.println("Approved");
        } else if (health >= 80) {
            System.out.println("Review required");
        } else {
            System.out.println("Rejected");
        }
    }
}
