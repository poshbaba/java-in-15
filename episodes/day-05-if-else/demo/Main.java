public class Main {
    public static void main(String[] args) {

        double healthPercentage = 92.5;

        if (healthPercentage >= 95) {
            System.out.println("Deployment approved");
        } else if (healthPercentage >= 80) {
            System.out.println("Deployment requires review");
        } else {
            System.out.println("Deployment rejected");
        }
    }
}
