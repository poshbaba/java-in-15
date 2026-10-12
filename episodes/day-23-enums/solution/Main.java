public class Main {
    public static void main(String[] args) {
        String[] inputs = {"STG", "UNKNOWN"};
        for (String input : inputs) {
            try {
                Environment environment = Environment.valueOf(input);
                System.out.println("Selected: " + environment);
            } catch (IllegalArgumentException exception) {
                System.out.println("Unknown environment: " + input);
            }
        }
    }
}
enum Environment { DEV, QA, STG, PROD }
