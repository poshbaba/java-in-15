public class Main {
    public static void main(String[] args) {
        double health = calculateHealthPercentage(10, 7);
        System.out.println("Health: " + health + "%");
    }
    public static double calculateHealthPercentage(int totalPods, int healthyPods) {
        return healthyPods * 100.0 / totalPods;
    }
}
