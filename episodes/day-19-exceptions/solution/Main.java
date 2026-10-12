public class Main {
    public static void main(String[] args) {
        System.out.println("Health: " + calculateHealth(10, 7) + "%");
    }
    static double calculateHealth(int total, int healthy) {
        if (total <= 0) {
            throw new IllegalArgumentException("Total replicas must be positive");
        }
        if (healthy < 0 || healthy > total) {
            throw new IllegalArgumentException("Healthy replicas must be between zero and total");
        }
        return healthy * 100.0 / total;
    }
}
