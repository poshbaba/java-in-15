public class Main {
    public static void main(String[] args) {
        double health = HealthPolicy.percentage(10, 7);
        System.out.println("Health: " + health + "%");
        System.out.println("Decision: " + HealthPolicy.classify(health));
    }
}
