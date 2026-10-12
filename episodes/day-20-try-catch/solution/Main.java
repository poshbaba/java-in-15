public class Main {
    public static void main(String[] args) {
        int[] totals = {10, 0, 5};
        for (int total : totals) {
            try {
                System.out.println("Health: " + calculateHealth(total, 5) + "%");
            } catch (IllegalArgumentException exception) {
                System.out.println("Cannot check health: " + exception.getMessage());
            }
        }
    }
    static double calculateHealth(int total, int healthy) {
        if (total <= 0) { throw new IllegalArgumentException("Total replicas must be positive"); }
        if (healthy < 0 || healthy > total) { throw new IllegalArgumentException("Invalid healthy count"); }
        return healthy * 100.0 / total;
    }
}
