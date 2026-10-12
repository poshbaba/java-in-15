public class Main {
    public static void main(String[] args) {
        int totalServers = 10;
        int healthyServers = 7;
        double healthPercentage = healthyServers * 100.0 / totalServers;
        System.out.println("Health: " + healthPercentage + "%");
        System.out.println("Healthy: " + (healthPercentage >= 80));
    }
}
