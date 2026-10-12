public final class HealthPolicy {
    public static double percentage(int total, int healthy) {
        if (total <= 0 || healthy < 0 || healthy > total) {
            throw new IllegalArgumentException("Invalid replica counts");
        }
        return healthy * 100.0 / total;
    }
    public static String classify(double health) {
        if (!Double.isFinite(health) || health < 0 || health > 100) {
            throw new IllegalArgumentException("Health must be between zero and 100");
        }
        if (health >= 95) { return "Approved"; }
        if (health >= 80) { return "Review required"; }
        return "Rejected";
    }
}
