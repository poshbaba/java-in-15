public class Main {
    public static void main(String[] args) {

        int totalPods = 10;
        int healthyPods = 8;

        double healthPercentage =
                (healthyPods * 100.0) / totalPods;

        boolean healthy = healthPercentage >= 80;

        System.out.println("Health: " + healthPercentage + "%");
        System.out.println("Healthy: " + healthy);
    }
}
