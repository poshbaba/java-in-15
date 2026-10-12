public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Health: " + calculateHealth(0, 0));
        } catch (IllegalArgumentException exception) {
            System.out.println("Cannot check health: " + exception.getMessage());
        } finally {
            System.out.println("Health check finished");
        }
        System.out.println("Program continues");
    }
    static double calculateHealth(int total, int healthy) {
        if (total <= 0) { throw new IllegalArgumentException("Total replicas must be positive"); }
        return healthy * 100.0 / total;
    }
}
