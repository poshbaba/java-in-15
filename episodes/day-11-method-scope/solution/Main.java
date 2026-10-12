public class Main {
    public static void main(String[] args) {
        int replicas = 3;
        System.out.println("Before: " + replicas);
        replicas = addReplica(replicas);
        System.out.println("After: " + replicas);
    }
    public static int addReplica(int replicas) {
        return replicas + 1;
    }
}
