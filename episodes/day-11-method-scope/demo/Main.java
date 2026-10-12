public class Main {
    public static void main(String[] args) {
        int replicas = 3;
        showUpdatedCount(replicas);
        System.out.println("Caller replicas: " + replicas);
    }
    public static void showUpdatedCount(int replicas) {
        replicas = replicas + 1;
        System.out.println("Inside method: " + replicas);
    }
}
