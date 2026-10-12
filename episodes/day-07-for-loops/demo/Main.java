public class Main {
    public static void main(String[] args) {

        String[] environments = {
                "DEV",
                "QA",
                "STG",
                "PROD"
        };

        for (int i = 0; i < environments.length; i++) {
            System.out.println(
                    "Checking environment: " + environments[i]
            );
        }
    }
}
